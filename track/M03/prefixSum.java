package track.M03;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        long[] prefix = new long[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
