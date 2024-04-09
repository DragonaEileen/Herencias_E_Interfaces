package ejercicio5;

public class Rectangulo extends Poligono{
	
	/* Fields */
	/**
	 * Longitud del lado 1
	 */
	double lado1;
	
	/**
	 * Longitud del lado 2
	 */
	double lado2;
	
	/* Constructors */
	/**
	 * Constructor SIN Parametros 
	 */
	public Rectangulo() {
		
		/* Un rectangulo tiene 4 lados */
		super(4);
		
	}//Fin Constructor W/O Parameters
	
	/**
	 * Constructor CON Parametros
	 * 
	 * @param lado1 Longitud del lado1
	 * @param lado2 Longitud del lado2
	 */
	public Rectangulo(double lado1, double lado2) {
		
		/* Un rectangulo tiene 4 lados */
		super(4);
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}//Fin Constructor WITH Parameters
	
	/* Getters */
	/**
	 * Método que devuelve la longitud del lado 1
	 * 
	 * @return this.lado1 Longitud del lado 1
	 */
	public double getLado1() {
		
		return this.lado1;
		
	}//Fin getLado1
	
	/**
	 * Método que devuelve la longitud del lado 2
	 * 
	 * @return this.lado2 Longitud del lado 2
	 */
	public double getLado2() {
		
		return this.lado2;
		
	}//Fin getLado2()
	
	/* Setters */
	/**
	 * Setter del Lado 1
	 * 
	 * @param lado1 Longitud actualizada del lado 1
	 */
	public void setLado1(double lado1) {
		
		/* Comprobación: el valor no puede ser menor o igual a 0 */
		if(lado1 > 0) {
			
			this.lado1 = lado1;
			
		}//Fin IF --> Check
		
	}//Fin Set Lado 1
	
	/**
	 * Setter para el Lado 2
	 * 
	 * @param lado2 Longitud actualizada del lado 2
	 */
	public void setLado2(double lado2) {
		
		/* Comprobación: la longitud debe ser mayor a 0 */
		if(lado2 > 0) {
			
			this.lado2 = lado2;
			
		}//Fin IF --> Check
		
	}//Fin Set Lado 2
	
	/* Métodos */
	/**
	 * Método que devuele la información relevante del rectángulo en cadena
	 * 
	 * @return strRectangulo Información en cadena del Rectangulo
	 */
	@Override
	public String toString() {
		
		/* PCC: String a devolver */
		String strRectangulo = "Tipo de Polígono: " + this.getClass().getName() + "\n"
				+ "Lado 1: " + this.lado1 + "\n"
						+ "Lado 2: " + this.lado2;
		
		return strRectangulo;
				
	}//Fin toString()
	
	/**
	 * Método que calcula y devuelve el area del poligono
	 * 
	 * @return areaSize Valor numerico del area del poligono
	 */
	public double area() {
		
		/* PCC: numero a devolver */
		double areaSize = this.lado1 * this.lado2;
		
		return areaSize;
		
	}//Fin area()
	
}
