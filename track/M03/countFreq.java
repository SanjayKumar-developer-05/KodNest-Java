package track.M03;

public class countFreq {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 10, 40 };
        int tar = 10;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                count++;
            }
        }

        System.out.println("Frequency of " + tar + " is: " + count);
    }
}
