package java1010;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
	        System.out.print("Enter a positive integer: ");
	        num = sc.nextInt();
	        
	        if (num <= 0) {
	            System.out.println("Please enter a positive integer.\n");
	        }
        }while(num < 0);
        sc.close();

        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.printf("\n%d is a prime number.", num);
        } else {
            System.out.printf("\n%d is not a prime number.", num);
        }
    }
	
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
