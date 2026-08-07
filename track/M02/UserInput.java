package track.M02;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte:");
        byte a = sc.nextByte();
        System.out.println("Byte Value: " + a);

        System.out.println("Enter Short:");
        short b = sc.nextShort();
        System.out.println("Short Value: " + b);

        System.out.println("Enter int:");
        int c = sc.nextInt();
        System.out.println("Int Value: " + c);

        System.out.println("Enter Long:");
        long d = sc.nextLong();
        System.out.println("Long Value: " + d);

        System.out.println("Enter Float:");
        float e = sc.nextFloat();
        System.out.println("Float Value: " + e);

        System.out.println("Enter Double:");
        double f = sc.nextDouble();
        System.out.println("Double Value: " + f);

        System.out.println("Enter Boolean:");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean Value: " + g);

        // Output
        /*
         * Enter byte:
         * 2
         * Byte Value: 2
         * Enter Short:
         * 24
         * Short Value: 24
         * Enter int:
         * 2468
         * Int Value: 2468
         * Enter Long:
         * 24681012
         * Long Value: 24681012
         * Enter Float:
         * 2.468
         * Float Value: 2.468
         * Enter Double:
         * 2.468101214
         * Double Value: 2.468101214
         * Enter Boolean:
         * true
         * Boolean Value: true
         */
    }
}
