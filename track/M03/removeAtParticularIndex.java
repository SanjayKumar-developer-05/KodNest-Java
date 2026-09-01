package track.M03;

public class removeAtParticularIndex {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 30, 40 };
        int index = 2;

        for (int i = 0; i < arr.length; i++) {
            if (i > index) {
                arr[i - 1] = arr[i];
            }
        }
        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
