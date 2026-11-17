package JavaZoo4;
public class JavaZoo4 {

    static String zooName = "Java Park";

    public static void main(String[] args) {

        ZooAnimal4 animal1 = new ZooAnimal4("Pecanzo", 5, "zooFood");
        Dolphin animal2 = new Dolphin("Freddy", 3, "zoofish");
        ZooAnimal4 animal3 = new ZooAnimal4("Leo", 4, "zooFood");
        ZooAnimal4 animal4 = new ZooAnimal4("Zuni", 2, "zooFood");

        animal1.eat("zooFood");

        animal2.eatFish();
        animal2.eat("zoofish");
        animal2.performTrick();

        animal1.eat("zoofood");
        animal3.eat("zoofood");
        animal4.eat("zoofood");

        animal2.eatFish();
        animal2.eat("zoofish");

        System.out.println("There are " +
            ZooAnimal4.getAnimalCounter() +
            " animals in the JavaZoo.");
    }
}