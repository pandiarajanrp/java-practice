package learn.interfaceClass;

public abstract class Animal {
    protected String type;
    Animal(String type) {
        this.type = type;
    }

    public abstract void move();

    public void printInfo() {
        System.out.println(type + " of instance " + getClass().getSimpleName());
    }
}
