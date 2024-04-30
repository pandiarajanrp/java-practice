package learn;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        //Boxing
        Integer boxedInt = Integer.valueOf(15); // unnecessary code
        Integer deprecatedBoxedInt = new Integer(15); //deprecated

        //Unboxing
        int unboxedInt = boxedInt.intValue(); // unnecessary

        //Recommended
        //Boxing
        Integer validBoxedInt = 15;

        //Unboxing
        int unBoxedInt = validBoxedInt;

        System.out.println(validBoxedInt.getClass().getName());
        // System.out.println(unBoxedInt.getClass().getName()); // This will fail because primitive do not have class

        //set value for Boxed and UnBoxed
        Double boxedValue = getBoxedValue();
        double unBoxedValue = getUnBoxedValue();
        System.out.println("Boxed value :: " + boxedValue);
        System.out.println("UnBoxed Value :: " + unBoxedValue);

        //Boxing and Unboxing array

    }

    public static Double getBoxedValue() {
        return Double.valueOf(100.00);
    }

    public static double getUnBoxedValue() {
        return 100.00;
    }
}
