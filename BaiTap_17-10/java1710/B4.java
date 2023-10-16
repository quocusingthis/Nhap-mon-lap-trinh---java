package java1710;

import java.util.Scanner;

public class B4 {
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

        int min = 1000;
        for (int i = 0; i < size; i++) {
        	if(min > array[i]) {
        		min = array[i];
        	}
        }
        System.out.println("The smallest value of the elements in the array is: " + min);
    }
}
