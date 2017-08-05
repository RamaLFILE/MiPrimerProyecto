package Lecciones;

public class L03_MasVariables2 {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185
        double pi = 3_000_000.1415927d;

        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);


    }



}
