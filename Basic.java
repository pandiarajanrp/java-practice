class Basic {
    public static void main(String[] args) {
        int age = 34;
        System.out.println("Hello World");
        System.out.println("Age is " + age);
        age = 23;
        System.out.println("Age after changed " + age);

        int myFirstNumber = 87;
        int mySecondNumber = 98;
        System.out.println("Addition " + (myFirstNumber + mySecondNumber));

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Int value between " + minValue + " " + maxValue);
        System.out.println("Print max value " + (maxValue + 10));
        int maxInt = 2_147_483_647;
        System.out.println("Int Sep value " + maxInt);

        Byte btMin = Byte.MIN_VALUE;
        Short shMax = Short.MAX_VALUE;
        System.out.println("Byte Sep value " + btMin + " " + shMax);

        //below line throw error
        //Byte bt = 129;

        long lg = 100L;

        //casting
        byte divByte = -128 / 2;
        byte minByte = Byte.MIN_VALUE;
        // divByte = minByte / 2; this throws error
        divByte = (byte) (minByte/2);
        System.out.println("div Byte" + divByte);
    }
}