package zoo;

/**
 * A cat that does what a cat does
 */
public class Cat extends Animal implements Mammal{
	
	/* Fields */
	/**
	 * Breed of the cat
	 */
	protected String catBreed;
	
	/**
	 * Name of the cat
	 */
	protected String catName;
	
	/* Constructor */
	/**
	 * Constructor with Parameters of a Wild Cat
	 * 
	 * @param catBreed Breed of the cat
	 * @param gender Gender of the cat
	 */
	public Cat(String catBreed, String gender) {
		
		/* If the cat is wild, the super.domestic keeps being false */
		this.catBreed = catBreed;
		super.gender = gender;
		
	}//Fin constructor (breed)
	
	/**
	 * Constructor WITH ALL Parameters
	 * 
	 * @param catBreed Breed of the cat
	 * @param gender Gender of the cat
	 * @param catName Name of a domestic cat
	 */
	public Cat(String catBreed, String gender, String catName) {
		
		/* If the cat has a name, it's a domestic cat */
		this.catBreed = catBreed;
		this.catName = catName;
		super.domestic = true;
		super.gender = gender;
		
	}//Fin Constructor (Breed, Name)
	
	/* Getters */
	/**
	 * Getter of the breed
	 * 
	 * @return this.catBreed Breed of the cat
	 */
	public String getBreed() {
		
		return this.catBreed;
		
	}//Fin getBreed()
	
	/* Hereditary Methods */
	/**
	 * Method to birth a new kitty:
	 * 	Depending on the breeds and gender of the 
	 * 
	 * @param otherParent The other parent of the new kitty
	 * @return kitty A new Kitty Cat
	 */
	public Cat toBirth(Cat otherParent) {
		
		/* Fields */
		/* Per Code Clarity: Lets declare the kitty */
		Cat kitty;
		
		/* PCC: Lets declare the gender of the kitty */
		String gender;
		
		/* PCC: Lets declare the breed of the kitty */
		String kittyBreed = "";
		
		/* A random int for fate purposes */
		int random;
		
		/* Depending on the breed of the parents the kitty is gonna have 
		 * one breed or another*/
		if(this.catBreed.equalsIgnoreCase(otherParent.getBreed())) {
			
			kittyBreed = this.catBreed;
			
		}else {
			
			random = (int) (Math.random()*2 + 1);
			
			switch (random) {
			case 1:
				
				kittyBreed = this.catBreed;
				break;
				
			case 2:
				
				kittyBreed = otherParent.getBreed();
				break;
				
			default:
				break;
			}//Fin SWITCH --> Kitty Breed
			
		}//Fin IF --> Breeds Equal
		
		/* Now we randomize gender */
		random = (int) (Math.random()*2+1);
		if(random == 1) {
			gender = "female";
		}else {
			gender = "male";
		}//Fin gender picker
		
		/* Lets build the kitty cat */
		kitty = new Cat(kittyBreed, gender);
	 	
		/* Return */
		return kitty;
		
	}//Fin toBirth()
	
	/**
	 * Method to eat and accept food
	 * 
	 * @param food Food given to the animal
	 * @return hasSucceded Success of being fed
	 */
	public boolean toEat(String food) {
		
		/* PCC: Boolean to return */
		boolean hasSucceded = false;
		
		/* Let's see if the food is contained in the diet */
		if(this.diet.contains(food)) {
			
			hasSucceded = true;
			
		}//Fin IF --> Diet contains given food
		
		/* Return */
		return hasSucceded;
		
	}//Fin toEat()
	
	
	
	
}
