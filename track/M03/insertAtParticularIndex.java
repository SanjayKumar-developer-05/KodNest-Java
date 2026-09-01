package track.M03;

public class insertAtParticularIndex {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int val = 5;
        int index = 0;

        int[] res = new int[arr.length + 1];
        for (int i = 0; i < res.length; i++) {
            if (i == index) {
                res[i] = val;
            } else if (i < index) {
                res[i] = arr[i];
            } else {
                res[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
