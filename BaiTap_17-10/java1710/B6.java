package java1710;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of strings (separated by spaces): ");
        String inputLine = sc.nextLine();
        String[] arr = inputLine.split(" ");

        selectionSort(arr);

        System.out.println("Sorted list of strings:");
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        sc.close();
    }
    
    static void selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
