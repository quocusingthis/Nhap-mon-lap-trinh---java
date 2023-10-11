package java1010;

import java.util.Scanner;

public class B3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        sc.close();

        int gcd = findGCD(num1, num2);
        
        System.out.printf("The GCD of %d and %d is: %d", num1, num2, gcd);
    }
	
	public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
