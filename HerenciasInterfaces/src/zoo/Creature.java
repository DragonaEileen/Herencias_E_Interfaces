package zoo;

/* Analysis: */
/* All living creatures do certain things to be consedered a living creature,
 *  therefore, a living creature (LC) has to live and die, has to feed itself,
 *  has to interact with the world around them.
 *  They could also do some things, like reproduce themselves. */

/**
 * All alive creatures do specific things: here are they kept
 * @author emiralles
 */
interface Creature {

	/* Methods */
	/**
	 * Method to initiate a creature: the birth of them
	 */
	void toBeBorn();
	
	/**
	 * Method to eliminate a creature: the death of the creature
	 */
	void toDie();
	
	/**
	 * Method to acquire nutrition: the eating habits of a creature
	 */
	void toEat();
	
	/**
	 * Method to interact with the world around: interaction of the creature
	 */
	void toInteract();

	/**
	 * Method to reproduce themselves: mating or creating descendants. 
	 */
	void toReproduce();
	
}
