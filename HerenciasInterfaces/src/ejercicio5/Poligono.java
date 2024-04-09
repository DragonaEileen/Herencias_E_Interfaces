package ejercicio5;

/**
 * Clase que representa un poligono
 * 
 * @author Eileen
 */
abstract class Poligono {
	
	/* Fields */
	/**
	 * Cantidad de lados que tiene el poligono
	 */
	int numeroLados;
	
	/* Constructors */
	/**
	 * Constructor con Parametros
	 * 
	 * @param numeroLados Cantidad de lados del polígono
	 */
	public Poligono(int numeroLados) {
		
		/* Comprobación: para ser un poligono tiene que tener
		 * más de dos lados */
		if(numeroLados > 2) {
			
			this.numeroLados = numeroLados;
			
		}//Fin IF --> Comprobación
		
	}//Fin Constructor CON parametros
	
	/* Getter */
	/**
	 * Getter para el número de lados
	 * 
	 * @return this.numeroLados Cantidad de Lados del polígono
	 */
	public int getNumeroDeLados() {
		
		return this.numeroLados;
		
	}//Fin getNumeroDeLados
	
	/* Métodos */
	/**
	 * Método abstracto para calcular el area según la subclase
	 */
	abstract double area();
	
	/**
	 * Método que devuelve una cadena con el numero de Lados
	 * 
	 * @return strNumeroLados Cadena con el número de lados
	 */
	@Override
	public String toString() {
		
		/* PCC: String que contiene el numero de lados */
		String strNumeroLados = "Número de Lados: " + this.numeroLados;
		
		return strNumeroLados;
		
	}//Fin toString()
	
}
