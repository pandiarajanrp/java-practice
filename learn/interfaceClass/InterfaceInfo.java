package learn.interfaceClass;

public class InterfaceInfo {
    public static void main(String[] args) {
        Bird bird = new Bird("Peacock");
        Animal bird1 = new Bird("Penquin");
        FlightEnabled bird2 = bird;
        Trackable bird3 = bird;

        bird.move();
        bird.takeOff();
        bird.fly();
        bird.land();
        bird.track();

        bird1.move();

        //Not available methods
//        bird1.takeOff();
//        bird1.fly();
//        bird1.land();
//        bird1.track();

        //Not available methods
        bird2.takeOff();
        bird2.fly();
        bird2.land();
        // bird2.move();
        // bird2.track();

        //Not available methods
        bird3.track();
//        bird3.move();
//        bird3.takeOff();
//        bird3.fly();
//        bird3.land();
    }
}
