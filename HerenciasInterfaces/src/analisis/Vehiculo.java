package analisis;

/**
 * Interfaz de un Vehículo, que incluye métodos para mover el vehículo
 * 
 * @author Eileen
 */
interface Vehiculo {

	/**
	 * Método que parará el movimiento del vehículo
	 */
	public void parar();

	/**
	 * Método que iniciará el movimiento del vehículo
	 */
	public void arrancar();
	
	/**
	 * Método que aumentará la marcha del vehículo
	 */
	public void marchaUp();
	
	/**
	 * Método que disminuirá la marcha del vehículo
	 */
	public void marchaDown();
	
}
