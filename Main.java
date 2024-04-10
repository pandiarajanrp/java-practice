public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //car.describeCar();

        //below are invalid because of private
        //car.make = "Tesla";
        //System.out.println("Car model is " + car.model);

        //use getter and setter methods to access and set the values for private fields
        car.setMake("Tesla");
        car.setModel("Model X");
        car.setDoors(4);
        car.setConvertible(true);

        car.describeCar();

        //Bank Account
        BankAccount bankAccount = new BankAccount("Pandiarajan R", "pandiarajan@gmail.com", "+999999999999", 454545454, 1540.56f);
//        bankAccount.setCustomerName("Pandiarajan R");
//        bankAccount.setEmail("pandiarajan@gmail.com");
//        bankAccount.setPhoneNumber("+999999999999");
//        bankAccount.setAccountNumber(454545454);
//        bankAccount.setAccountBalance(1540.56f);
        System.out.println("Hi " + bankAccount.getCustomerName());
        bankAccount.deposit(100);
        System.out.println("New Balance " + bankAccount.getAccountBalance());

        bankAccount.withDrawl(150);
        System.out.println("Balance after withdraw " + bankAccount.getAccountBalance());

        Dog dog = new Dog("Maya");
        Dog dog2 = new Dog("German Shepard");
        System.out.println("Dog name " + dog.getName());
    }
}
