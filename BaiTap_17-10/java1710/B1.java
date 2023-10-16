package java1710;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at position " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("The total value of the elements in the array is: " + sum);
    }
}
