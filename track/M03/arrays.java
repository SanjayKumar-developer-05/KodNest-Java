package track.M03;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed array elements are: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += a[i];
        }
        System.out.println("Sum of all elements in array: " + total);

        sc.close();
    }
}
