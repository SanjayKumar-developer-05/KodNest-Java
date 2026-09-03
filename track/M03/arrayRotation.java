package track.M03;

public class arrayRotation {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        int antiClock = 0;
        int clock = 1;

        while (clock != 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            clock--;
        }

        while (antiClock != 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            antiClock--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
