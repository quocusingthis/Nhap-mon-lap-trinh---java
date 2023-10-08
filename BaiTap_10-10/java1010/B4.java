package java1010;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = sc.nextLine();
        sc.close();
        
        boolean isValid = true;

        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(i);
            if (bit != '0' && bit != '1') {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            int decimalValue = 0;
            int power = 1;

            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char bit = binaryString.charAt(i);
                int bitValue = bit - '0';
                decimalValue += bitValue * power;
                power *= 2;
            }

            System.out.println("Decimal equivalent: " + decimalValue);
        } else {
            System.out.println("\nInvalid binary string.");
        }
    }
}
