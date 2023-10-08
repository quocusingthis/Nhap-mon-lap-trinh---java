package java1010;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        sc.close();

        int gcd = 1;
        int smaller = (num1 < num2) ? num1 : num2;

        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        
        System.out.printf("The GCD of %d and %d is: %d", num1, num2, gcd);
    }
}
