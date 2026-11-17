package JavaZoo3;

public class JavaZoo3 {


	    public static void main(String[] args) {

	        // Create a ZooAnimal object
	        ZooAnimal3 animal = new ZooAnimal3(
	            "Pecanzo", "Elephant", 5, true
	        );

	        // Create a ZooKeeper object
	        ZooKeeper3 keeper = new ZooKeeper3(
	            "John", "Head Keeper", 150.00, true
	        );

	        // Create a Cage object
	        Cage3 cage = new Cage3(
	            20, 15, 10, true, true
	        );
	        
	        // Add the animal to the cage
	        cage.setAnimal(animal);

	        // Display cage information
	        cage.displayCageInfo();

	        // Feed the animal
	        keeper.feedAnimal(animal, "Grass");

	        // Clean the cage
	        keeper.cleanCage();

	        // Calculate ZooKeeper salary
	        double salary = keeper.payMe(8);

	        System.out.println(
	            keeper.getName() + "'s salary is: " + salary
	        );
	    }
	}

