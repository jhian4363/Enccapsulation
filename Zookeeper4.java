package JavaZoo4;

class ZooKeeper4 {
    private String name;
    private String title;
    private double payRate;
    private boolean degree;

    public ZooKeeper4(String name, String title,
                     double payRate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setDegree(boolean degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean isDegree() {
        return degree;
    }

    public void feedAnimal(ZooAnimal4 animal) {
        animal.eat("zoofood");
    }

    public void feedAnimal(ZooAnimal4 animal, String food) {
        animal.eat(food);
    }
}
