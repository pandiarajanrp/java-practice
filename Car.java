public class Car {
    private String model;
    private String make;
    private int doors;
    private int wheels;
    private boolean convertible;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(
                "Model " + model + " " +
                "Make " + make + " " +
                "Door " + doors + " " +
                "Wheels " + wheels + " " +
                "Convertible " + (convertible ? " Covertable " : "Not convertible") + " "
        );
    }

}
