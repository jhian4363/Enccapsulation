package JavaZoo4;
class Cage4 {
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;
    private ZooAnimal4 animal;

    public Cage4() {
    }

    public Cage4(int length, int width, int height,
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

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setAnimal(ZooAnimal4 animal) {
        this.animal = animal;
    }

    public ZooAnimal4 getAnimal() {
        return animal;
    }

    public void displayCageInfo() {
        System.out.println("Cage Length: " + length);
        System.out.println("Cage Width: " + width);
        System.out.println("Cage Height: " + height);
        System.out.println("Clean: " + clean);
        System.out.println("Covered: " + covered);
    }
}
