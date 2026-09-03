package track.M03;

public class suffixSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        long[] suffix = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                suffix[i] += arr[j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(suffix[i] + " ");
        }
    }
}
