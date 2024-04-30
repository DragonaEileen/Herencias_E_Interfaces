package zoo;

public class MainZoo {

	public static void main(String[] args) {

		Cat miette = new Cat("Siamese", "female");
		
		Cat yukii = new Cat("Persian", "female");
		
		Cat kitty = (Cat) miette.toBirth(yukii);
		
		System.out.println(kitty.catBreed + " - " + kitty.gender);
		
	}

}
