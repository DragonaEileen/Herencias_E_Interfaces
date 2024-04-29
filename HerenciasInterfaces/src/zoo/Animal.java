package zoo;

/**
 * This class represents an Animal, with sounds, legs, sleep and diet
 * 
 * @author Eileen
 */
abstract class Animal implements Creature{

	/* Fields */
	/**
	 * String of the sound the animal makes
	 */
	protected String sound;
	
	/**
	 * Time period when the animal sleeps
	 */
	protected String sleep;
	
	/**
	 * Number of legs the animal has
	 */
	protected int legs;
	
	/**
	 * String that keeps what the animals eat
	 */
	protected String diet;
	
	/**
	 * Gender of the Animal
	 */
	String gender;
	
	/**
	 * Boolean to surmise if the animal is domestic
	 */
	boolean domestic = false;
	
	/**
	 * Method in which the animal is born
	 */
	String birth;
	
	/* Getters */
	/**
	 * Getter of the sound
	 * 
	 * @return this.sound Sound that the animal makes
	 */
	public String getSound() {
		
		return this.sound;
		
	}//Fin getSound()
	
	/**
	 * Getter of the sleep
	 * 
	 * @return this.sleep Time period when the creature sleeps
	 */
	public String getSleep() {
		
		return this.sleep;
		
	}//Fin getSleep()
	
	/**
	 * Getter of the legs
	 * 
	 * @return this.legs Number of legs the animal has
	 */
	public int getLegs() {
		
		return this.legs;
		
	}//Fin getLegs()
	
	/**
	 * Getter of the diet
	 * 
	 * @return this.diet Diet of the animal
	 */
	public String getDiet() {
		
		return this.diet;
		
	}//Fin getDiet()
	
}
