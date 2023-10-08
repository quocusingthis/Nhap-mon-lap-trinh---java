package java1010;

import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (terminate with 0): ");
            int number = sc.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
                count = 1;
            } else if (number == maxNumber) {
                count++;
            } else if (number < 0) {
            	maxNumber = 0;
                count = 1;
                break;
            }
            
            if (number == 0) {
                break;
            }
        }
        sc.close();

        System.out.println("The maximum number is: " + maxNumber);
        System.out.println("The number of occurrences of the maximum number is: " + count);
    }
}
