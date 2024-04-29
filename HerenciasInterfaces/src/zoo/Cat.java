package zoo;

/**
 * A cat that does what a cat does
 */
public class Cat extends Mammal{
	
	/* Fields */
	/**
	 * Breed of the cat
	 */
	String catBreed;
	
	/**
	 * Name of the cat
	 */
	String catName;
	
	/* Constructor */
	/**
	 * Constructor with Parameters of a Wild Cat
	 * 
	 * @param catBreed Breed of the cat
	 */
	public Cat(String catBreed) {
		
		/* If the cat is wild, the super.domestic keeps being false */
		this.catBreed = catBreed;
		
	}//Fin constructor (breed)
	
	/**
	 * Constructor WITH ALL Parameters
	 * 
	 * @param catBreed Breed of the cat
	 * @param catName Name of a domestic cat
	 */
	public Cat(String catBreed, String catName) {
		
		/* If the cat has a name, it's a domestic cat */
		this.catBreed = catBreed;
		this.catName = catName;
		super.domestic = true;
		
	}//Fin Constructor (Breed, Name)
	
}
