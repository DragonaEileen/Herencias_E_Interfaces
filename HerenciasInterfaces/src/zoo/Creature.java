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
	 * Method to initiate a creature of the same kin: the birth of them
	 */
	void toBirth();
	
	/**
	 * Method to acquire nutrition: the eating habits of a creature
	 */
	void toEat();
	
}
