public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "Large", 30);
        printAnimal(animal);

        Dog dog = new Dog("Dog", "Large", 50);
        printAnimal(dog);
    }

    public static void printAnimal(Animal animal) {
        animal.walk();
        animal.makeNoise();
        animal.printDetails();
        System.out.println(animal);
    }
}
