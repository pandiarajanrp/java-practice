public class Dog extends Animal{
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public Dog(String type, String size, int weight) {
        super(type, size, weight);
        Dog.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeNoise() {
        System.out.println("This is dog class make noise");
    }
}
