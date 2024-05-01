package learn.interfaceClass;

public class Bird extends Animal implements FlightEnabled, Trackable {
    Bird(String type) {
        super(type);
    }
    @Override
    public void move() {
        System.out.println(type + " is moving ");
    }

    @Override
    public void takeOff() {
        System.out.println(type + " is taking off");
    }

    @Override
    public void fly() {
        System.out.println(type + " is flying");
    }

    @Override
    public void land() {
        System.out.println(type + " is landing");
    }

    @Override
    public void track() {
        System.out.println(type + " is tracked between co-ordinates");
    }
}
