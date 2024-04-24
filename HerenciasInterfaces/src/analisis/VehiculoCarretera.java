package analisis;

/**
 * Clase representativa de un vehículo de carretera en general
 * 
 * @author Eileen
 */
abstract class VehiculoCarretera implements Vehiculo {

	/* Fields */	
	/**
	 * Marca o empresa del vehículo
	 */
	protected String marca;
	
	/**
	 * Modelo específico del vehículo
	 */
	protected String model;
	
	/**
	 * Color del vehículo
	 */
	protected String color;
	
	/**
	 * Matrícula del vehículo
	 */
	protected String matricula;
	
	/**
	 * Estado del motor del vehiculo: encendido (true) o apagado(false)
	 */
	private boolean motorOnOff = false;
	
	/**
	 * Marcha actual del vehículo
	 */
	private int marcha = 0;
	
	/**
	 * Velocidad actual del vehículo
	 */
	private double velocity = 0;
	
	
	/* Constructors */
	/**
	 * Constructor WITH Parameters
	 * 
	 * @param marca Marca del vehículo
	 * @param model Modelo del vehículo
	 * @param color Color del vehículo
	 * @param matricula Identificador del vehículo
	 */
	protected VehiculoCarretera(String marca, String model, String color, String matricula) {
		
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.matricula = matricula;
		
	}//Fin Constructor
	
	
	/* Getters */
	/**
	 * Getter del field "marca"
	 * 
	 * @return this.marca Marca del vehículo
	 */
	public String getMarca() {
		
		return this.marca;
		
	}//Fin getMarca()
	
	/**
	 * Getter del field "model"
	 * 
	 * @return this.model Modelo del vehiculo
	 */
	public String getModel() {
		
		return this.model;
		
	}//Fin getModel()
	
	/**
	 * Getter del field "color"
	 * 
	 * @return this.color Color del vehiculo
	 */
	public String getColor() {
		
		return this.color;
		
	}//Fin getColor()
	
	/**
	 * Getter del field "matricula"
	 * 
	 * @return this.matricula Matricula identificadora del vehiculo
	 */
	public String getMatricula() {
		
		return this.matricula;
		
	}//Fin getMatricula
	
	/**
	 * Getter del estado del motor
	 * 
	 * @return this.motorOnOff Estado del motor
	 */
	public boolean getMotorState() {
		
		return this.motorOnOff;
		
	}//Fin getMotorState()
	
	/**
	 * Getter de la marcha actual del vehículo
	 * 
	 * @return this.marcha Marcha actual del vehiculo
	 */
	public int getMarcha() {
		
		return this.marcha;
		
	}//Fin getMarcha()
	
	/**
	 * Getter de la velocidad actual del vehiculo
	 * 
	 * @return this.velocity Velocidad actual del vehiculo
	 */
	public double getVelocity() {
		
		return this.velocity;
		
	}//Fin getVelocity()
	
	
	/* Setters */
	/**
	 * Sets the marca del vehiculo
	 * 
	 * @param marca Marca actualizada del vehiculo
	 */
	public void setMarca(String marca) {
		
		this.marca = marca;
		
	}//Fin setMarca()
	
	/**
	 * Sets the model of the vehicle
	 * 
	 * @param model Model of the Vehicle
	 */
	public void setModel(String model) {
		
		this.model = model;
		
	}//Fin setModel()
	
	/**
	 * Sets the color of the vehicle
	 * 
	 * @param color Color of the vehicle
	 */
	public void setColor(String color) {
		
		this.color = color;
		
	}//Fin setColor()
	
	/**
	 * Sets the matricula of the vehicle
	 * 
	 * @param matricula Matricula identifier of the vehicle
	 */
	public void setMatricula(String matricula) {
		
		this.matricula = matricula;
		
	}//Fin setMatricula()

	
	/* Methods */
		/* Hereditary */
	/**
	 * Method to set the field "motorOnOff" to Off
	 */
	@Override
	public void parar() {

		this.motorOnOff = false;
		
	}//Fin parar()

	/**
	 * Method to set the field "motorOnOff" to On
	 */
	@Override
	public void arrancar() {

		this.motorOnOff = true;
		
	}//Fin arrancar()

	/**
	 * Method to increase the marcha of the vehicle
	 */
	@Override
	public void marchaUp() {

		//Marcha is going to increase if it's lesser than 5
		if(this.marcha < 5) {
			
			this.marcha += 1;
			
		}//Fin IF --> Marcha lesser than 5
		
	}//Fin marchaUp()

	/**
	 * Method to decrease the marcha of the vehicle
	 */
	@Override
	public void marchaDown() {

		//Marcha is going to decrease if its greater than 0
		if(this.marcha > 0) {
			
			this.marcha -= 1;
			
		}//Fin IF --> Marcha greater than 0
		
	}//Fin marchaDown()
	
		/* Ordinary */
	
	
}
