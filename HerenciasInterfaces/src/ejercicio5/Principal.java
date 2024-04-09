package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	/* Declaraciones */
	/* Conjunto de Triangulos y Rectangulos */
	static ArrayList<Poligono> arrayDeUso = new ArrayList<Poligono>();
	
	/* Rectangulo Base */
	static Rectangulo rectangle;
	
	/* Triángulo Base */
	static Triangulo triangle;
	
	static /* Apertura de Scanner */
	Scanner scannercito = new Scanner(System.in);

	public static void main(String[] args) {
		
		/* Declaraciones */
		/* Opción de Menú */
		int chosenOption = -1;
		
		/* Success */
		boolean hasSucceded;
		
		/* Menú */
		/* Bucle Principal */
		do {
			
			System.out.println("1. Introducir triángulo. \n"
					+ "2. Introducir rectángulo. \n"
					+ "3. Mostrar contenido del array. \n");
			
			//Comprobación
			do{
				
				try{
					
					System.out.println("Introduce una Opción");
					chosenOption = scannercito.nextInt();
					
				}catch(Exception e){
				
					System.err.println("Opción No Valida");
					
				}
				
			}while(chosenOption < 0);
			
			/* Chosen Option */
			hasSucceded = magicMenu(chosenOption);
			
			if(hasSucceded) {
				
				System.out.println("Exito");
				
			}else {
				
				System.out.println("Not a Success");
				
			}//Fin IF hasSucceded
			
		}while(chosenOption != 0);
			
		/* Cierre de Scanner */
		scannercito.close();
		
	}//FIN MAIN
	
	public static boolean magicMenu(int chosenOption) {
		
		/* PCC: boolean to return */
		boolean hasSucceded = false;
		
		//Options
		if(chosenOption == 1) { //Option ADD Triangle
			
			hasSucceded = addTriangle();
			
		}else if(chosenOption == 2) {	//Option ADD Rectangle
			
			hasSucceded = addRectangle();
			
		}else if(chosenOption == 3) {	//Option Show ALL
			
			hasSucceded = true;
			
			showAll();
			
		}//Fin IF --> Options
		
		return hasSucceded;
		
	}//Fin magicMenu()
	
	/* Method to add triangle */
	public static boolean addTriangle() {
		
		/* PCC: boolean to return */
		boolean hasSucceded = false;
		
		/* Lado 1 */
		double lado1 = 0;
		
		/* Lado 2 */
		double lado2 = 0;
		
		/* Lado 3 */
		double lado3 = 0;
		
		do{
			
			try{
				
				System.out.println("Introduce la longitud de los tres lados del triangulo");
				lado1 = scannercito.nextDouble();
				lado2 = scannercito.nextDouble();
				lado3 = scannercito.nextDouble();
				
			}catch(Exception e){
				
				System.err.println("Nope");
				
			}
			
		}while(lado1 <= 0 || lado2 <= 0 || lado3 <= 0);

		
		triangle = new Triangulo(lado1, lado2, lado3); 
		
		hasSucceded = arrayDeUso.add(triangle);
		
		return hasSucceded;
		
	}//Fin addTriangle()
	
	/* Method to add Rectangle */
	public static boolean addRectangle() {
		
		/* PCC: boolean to return */
		boolean hasSucceded = false;
		
		/* Lado 1 */
		double lado1 = 0;
		
		/* Lado 2 */
		double lado2 = 0;
		
		do{
			
			try{
				
				System.out.println("Introduce la longitud de los dos lados del rectangulo");
				lado1 = scannercito.nextDouble();
				lado2 = scannercito.nextDouble();
						
			}catch(Exception e){
				
				System.err.println("Nope");
				
			}
			
		}while(lado1 <= 0 || lado2 <= 0);
		
		rectangle = new Rectangulo(lado1, lado2); 
		
		hasSucceded = arrayDeUso.add(rectangle);
		
		return hasSucceded;
		
	}//Fin addTriangle()
	
	/* Method to show everything */
	public static void showAll() {
		
		/* PCC: string to print */
		String strArray = "";
		
		//Adding Loop
		for(Poligono p: arrayDeUso) {
			
			strArray += p + "\n Área: " + p.area()+ "\n";
			
		}//Fin LOOP --> Adding
		
		System.out.println(strArray);
		
	}//Fin showAll()
	
}
