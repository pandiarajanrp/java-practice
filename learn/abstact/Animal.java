package learn.abstact;

public abstract class Animal {
    protected String type;
    protected String size;
    private int weight;
    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void makeNoice();

    public abstract void move();

    public void printInfo() {
        System.out.println(getClass().getSimpleName() + " " + type + " " + size + " " + weight);
    }
}