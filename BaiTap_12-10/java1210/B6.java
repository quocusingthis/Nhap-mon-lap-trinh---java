package java1010;

import java.util.Scanner;

public class B6 {
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

        String binaryString = decimalToBinary(decimalNumber);

        System.out.println("Binary equivalent: " + binaryString);
    }
	
	public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryString.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binaryString.toString();
    }
}
