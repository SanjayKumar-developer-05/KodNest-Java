package track.M02;

public class BAndC {
    public static void main(String[] args) {
        // Break Statement
        System.out.println("Break Statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Continue Statement
        System.out.println("Continue Statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Output
        /*
         * Break Statement
         * 1
         * 2
         * 3
         * 4
         * Continue Statement
         * 1
         * 2
         * 3
         * 4
         * 6
         * 7
         * 8
         * 9
         * 10
         */
    }
}
