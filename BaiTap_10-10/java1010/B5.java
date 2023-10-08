package java1010;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNumber;

        do {
            System.out.print("Enter a positive integer: ");
            decimalNumber = sc.nextInt();

            if (decimalNumber <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.\n");
            }
        } while (decimalNumber <= 0);

        sc.close();

        StringBuilder binaryStringBuilder = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryStringBuilder.insert(0, remainder);
            decimalNumber /= 2;
        }

        System.out.println("Binary equivalent: " + binaryStringBuilder.toString());
    }
}
