/**
 *
 * Introducción a las variables
 *
 */

package Lecciones;

public class L01_IntroduccionVariables {

    public static void main(String[] args) {

        System.out.println("Lección 1");
        System.out.println("Hello Tim!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
    }
}