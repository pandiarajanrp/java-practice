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

        Double dt = Double.MAX_VALUE - Float.MAX_VALUE;
        System.out.println("Decimal dt " + Double.MAX_VALUE);
        System.out.println("Float max " + Float.MAX_VALUE);

        System.out.println("Diff " + dt);

        //initialize decimal
        //float fl = 5.25; //this will throw error
        float fl = 5.25f;
        float fl2 = (float) 8.25;
        System.out.println("Float value " + fl + " " + fl2);

        double dlv = 5.45; //java default decimal literal is double
        System.out.println("Double value " + dlv);

        double df = 5d / 3d;
        System.out.println("double precision " + df);

        float ff = 5f / 3f;
        System.out.println("float precision " + ff);

        double myVal = 5.00 / 3f; //this will fail because double is defalut
        double myval = (double) 5.0 / 3f;
        System.out.println("double value " + myval);

        char c = 'c';
        char myUnicode = '\u0044'; // D
        char decimalCode = 68;
        String str = "hello world";
        System.out.println("My Chars " + myUnicode + " uni " + myUnicode + " dec " + decimalCode);

        //Boolean
        boolean isDone = true;
        boolean isReady = false;
        System.out.println("Done " + isDone);
    }
}