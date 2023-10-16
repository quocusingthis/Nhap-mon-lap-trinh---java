package java1710;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
}
