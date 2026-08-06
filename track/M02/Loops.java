package track.M02;

public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("While Loop");
        int a = 1;
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        // Do-While loop
        System.out.println("Do While Loop");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b < 10);

        // Nested For Loop
        System.out.println("Nested For Loop");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
            System.out.println();
        }

        // Nested While Loop
        System.out.println("Nested While Loop");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            System.out.println();
            i++;
        }

        // Nested Do While Loop
        System.out.println("Nested Do While Loop");
        int c = 1;
        do {
            int d = 1;
            do {
                System.out.println(d);
                d++;
            } while (d <= 5);
            System.out.println();
            c++;
        } while (c <= 5);

        // Output
        /*
         * For Loop
         * 0
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * While Loop
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * Do While Loop
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * Nested For Loop
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * Nested While Loop
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * Nested Do While Loop
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         */
    }
}