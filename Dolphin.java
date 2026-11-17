package JavaZoo4;
public class Dolphin extends ZooAnimal4 {

    public Dolphin(String name, int age, String favoriteFood) {
        super(name, age, favoriteFood);
    }

    public void eatFish() {
        System.out.println(name + " eats lots of zoofish.");
    }

    public void performTrick() {
        System.out.println(name + " is performing a flip.");
    }
}