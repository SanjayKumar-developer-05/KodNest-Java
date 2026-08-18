package track.M03;

import java.util.Scanner;

public class min_max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = 0;

        min = max = arr[0];

        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        sc.close();
    }
}
