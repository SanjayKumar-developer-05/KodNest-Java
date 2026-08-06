package track.M02;

public class LabeledLoopBreak {
    public static void main(String[] args) {
        // Breaking Outer Loop
        System.out.println("Breaking Outer Loop");
        outer: for (int i = 1; i <= 3; i++) {
            inner: for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    break outer;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }

        // Output
        /*
         * Breaking Outer Loop
         * i: 1 j: 1
         * i: 1 j: 2
         * i: 1 j: 3
         */
    }
}
