public class Animal {
    private String type;
    private String size;
    private int weight;

    public Animal() {

    }
    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void walk() {
        System.out.println(type + " walking ");
    }

    public void makeNoise() {
        System.out.println("Animal Type " + type + " make some noise ");
    }

    public void printDetails() {
        System.out.println(
                "Type " + type + " " +
                "Size " + size + " " +
                "Weight " + weight + " "
        );
    }
}
