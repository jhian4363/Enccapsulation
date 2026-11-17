package JavaZoo3;

public class Cage3 {

	    private int length;
	    private int width;
	    private int height;
	    private boolean clean;
	    private boolean covered;
	    private ZooAnimal3 animal;

	    public Cage3() {
	    }

	    public Cage3(int length, int width, int height,
	                boolean clean, boolean covered) {

	        this.length = length;
	        this.width = width;
	        this.height = height;
	        this.clean = clean;
	        this.covered = covered;
	    }

	    public void setLength(int length) {
	        this.length = length;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public void setClean(boolean clean) {
	        this.clean = clean;
	    }

	    public void setCovered(boolean covered) {
	        this.covered = covered;
	    }

	    public void setAnimal(ZooAnimal3 animal) {
	        this.animal = animal;
	    }

	    public int getLength() {
	        return length;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public ZooAnimal3 getAnimal() {
	        return animal;
	    }

	    public boolean isClean() {
	        return clean;
	    }

	    public boolean isCovered() {
	        return covered;
	    }

	    public void displayCageInfo() {

	        if (animal != null) {
	            System.out.println("This cage has a " +
	                animal.getType() + " named " +
	                animal.getName() + ".");
	        } else {
	            System.out.println("This cage is empty.");
	        }
	    }
	}