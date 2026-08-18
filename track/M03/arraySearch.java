package track.M03;

public class arraySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 45, 50 };
        Boolean found = false;
        int tar = 45;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }
}
