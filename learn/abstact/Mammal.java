package learn.abstact;

import learn.abstact.Animal;

public abstract class Mammal extends Animal {

    public Mammal(String type, String size, int weight) {
        super(type, size, weight);
    }

    public abstract void eat();

    public void printInfo() {
        System.out.println(getClass().getSimpleName() + " printed ");
    }
}