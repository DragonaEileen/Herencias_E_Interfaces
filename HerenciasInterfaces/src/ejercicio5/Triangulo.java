


package ejercicio5;

public class Triangulo extends Poligono{

	/* Fields */
	/**
	 * Longitud del lado 1
	 */
	double lado1;
	
	/**
	 * Longitud del lado 2
	 */
	double lado2;
	
	/**
	 * Longitud del lado 3
	 */
	double lado3;
	
	/* Constructors */
	/**
	 * Constructor W/O Parameters
	 */
	public Triangulo() {
		
		/* Los triangulos tienen 3 lados */
		super(3);
		
	}//Fin Constructor W/O Parameters
	
	/**
	 * Constructor WITH Parameters
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		
		/* Los triangulos tienen 3 lados */
		super(3);
		
		/* La longitud de los lados debe ser mayor de 0 */
		if(lado1 > 0 && lado2 > 0 && lado3 > 0) {
			
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		
		}//Fin IF --> Check
			
	}//Fin Constructor WITH Parameters

	/* Getters */
	/**
	 * Getter para la longitud del lado 1
	 * 
	 * @return this.lado1 Longitud del lado 1
	 */
	public double getLado1() {
		
		return this.lado1;
	
	}//Fin getLado1()

	/**
	 * Getter del lado 2
	 * 
	 * @return this.lado2 Longitud del lado 2
	 */
	public double getLado2() {
		
		return this.lado2;
	
	}//Fin Get Lado 2

	/**
	 * Getter del lado 3
	 * 
	 * @return this.lado3 Longitud del lado 3
	 */
	public double getLado3() {
		
		return this.lado3;
		
	}//Fin Get Lado 3

	/**
	 * Setter del lado 1
	 * 
	 * @param lado 1 Longitud actualizada del lado 1
	 */
	public void setLado1(double lado1) {
		
		/* Comprobación */
		if(lado1 > 0) {
			
			this.lado1 = lado1;
			
		}//Fin IF --> Check
		
	}//Fin Set Lado 1

	/**
	 * Setter para el Lado 2
	 * 
	 * @param lado2 Longitud actualizada del Lado 2
	 */
	public void setLado2(double lado2) {
		
		/* Comprobación */
		if(lado2 > 0) {
			
			this.lado2 = lado2;
	
		}//Fin IF --> Check

	}//Fin Set Lado 2
		
	/**
	 * Setter del Lado 3
	 * 
	 * @param lado3 Longitud actualizada del lado 3
	 */
	public void setLado3(double lado3) {
		
		/* Comprobación */
		if(lado3 > 0) {
			
			this.lado3 = lado3;
		
		}//Fin IF --> Check
	
	}//Fin Set Lado 3
		
	/* Métodos */
	/**
	 * Método que duevuelve la información del Triangulo en Cadena
	 * 
	 * @return strTriangulo Cadena de la información del triangulo
	 */
	@Override
	public String toString() {
		
		/* PCC: cadena a devolver */
		String strTriangulo = "Tipo de Polígono: " + this.getClass().getName() + "\n"
				+ "Lado 1: " + this.lado1 + "\n"
						+ "Lado 2: " + this.lado2 + "\n"
								+ "Lado 3: " + this.lado3;
		
		return strTriangulo;
		
	}//Fin toString()

	/**
	 * Método que calcula el area del triangulo
	 * 
	 * @return areaSize Tamaño del area del Triangulo
	 */
	public double area() {
		
		/* PCC: variables */
		double semiPerimeter = (lado1+lado2+lado3)/2;
		double areaSize = Math.sqrt(semiPerimeter*(semiPerimeter-lado1)*(semiPerimeter-lado2)*(semiPerimeter-lado3));
		
		return areaSize;
		
	}//Fin area()
	
}
