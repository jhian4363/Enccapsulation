package JavaZoo3;

public class ZooAnimal3 {
 

	    private String name;
	    private String type;
	    private int age;
	    private boolean hungry;

	    public ZooAnimal3() {
	    }

	    public ZooAnimal3(String name, String type, int age, boolean hungry) {
	        this.name = name;
	        this.type = type;
	        this.age = age;
	        this.hungry = hungry;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setHungry(boolean hungry) {
	        this.hungry = hungry;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getAge() {
	        return age;
	    }

	    public boolean isHungry() {
	        return hungry;
	    }

	    public void sleep() {
	        System.out.println(name + " is sleeping.");
	    }

	    public void sleep(int hours) {
	        System.out.println(name + " slept for " + hours + " hours.");
	    }

	    public void eat() {
	        hungry = false;
	        System.out.println(name + " is eating.");
	    }

	    public void eat(String food) {
	        hungry = false;
	        System.out.println(name + " is eating " + food + ".");
	    }
	}

