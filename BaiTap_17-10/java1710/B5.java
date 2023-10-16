package java1710;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array 1: ");
        String input1 = sc.nextLine();
        String[] arr1 = input1.split(" ");

        System.out.print("Enter array 2: ");
        String input2 = sc.nextLine();
        String[] arr2 = input2.split(" ");

        sc.close();

        boolean equal = true;

        if (arr1.length != arr2.length) {
            equal = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }
}
