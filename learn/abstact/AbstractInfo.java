package learn.abstact;

import java.util.ArrayList;

class Dog extends Animal{
    Dog(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoice() {
        System.out.println(type + " " + getClass().getSimpleName() + " made noice.. wowwwww");
    }

    @Override
    public void move() {
        System.out.println(type + " " + getClass().getSimpleName() + " moved to street");
    }
}

class Fish extends Animal {
    Fish(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoice() {
        System.out.println(type + " " + getClass().getSimpleName() + " made noice.. wowwwww");
    }

    @Override
    public void move() {
        System.out.println(type + " " + getClass().getSimpleName() + " moved to street");
    }
}

class Horse extends Mammal {
    public Horse(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoice() {
        System.out.println("Horse making Noice");
    }

    @Override
    public void move() {
        System.out.println("Horse moving");
    }

    @Override
    public void eat() {
        System.out.println(type + " " + getClass().getSimpleName() + " eats small fishes");
    }
}

public class AbstractInfo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Affenpinscher", "large", 10);
        Dog dog2 = new Dog("Afghan Hound", "medium", 15);
        Dog dog3 = new Dog("Alaskan Malamute", "small", 15);

        Animal fish1 = new Fish("hagfish", "large", 50);
        Animal fish2 = new Fish("lampreys", "medium", 30);
        Animal fish3 = new Fish("cartilaginous", "small", 20);

        //horse
        Mammal horse = new Horse("horse", "large", 300);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        //fish
        animals.add(fish1);
        animals.add(fish2);
        animals.add(fish3);

        //horse
        animals.add(horse);

        for (Animal animal: animals) {
            animal.makeNoice();
            animal.move();
            animal.printInfo();
            if (animal instanceof Mammal mammal) {
                mammal.eat();
            }
            System.out.println("=====================");
        }
    }
}