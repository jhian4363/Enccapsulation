package JavaZoo4;
public class ZooAnimal4 {
    String name;
    int age;
    String favoriteFood;

    static int animalCounter = 0;

    public ZooAnimal4(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
        animalCounter++;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}