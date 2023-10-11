package java1010;

import java.util.Scanner;

public class B9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findMaxAndCount(sc);
        sc.close();
    }
	
	public static void findMaxAndCount(Scanner scanner) {
        int maxNumber = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Enter a sequence of integers (ending with 0):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
            	if(maxNumber == Integer.MIN_VALUE) {
            		maxNumber = 0;
                    count = 1;
            	}
                break;
            }

            if (num > maxNumber) {
                maxNumber = num;
                count = 1;
            } else if (num == maxNumber) {
                count++;
            }
            if (maxNumber < 0) {
            	maxNumber = 0;
                count = 1;
            }
        }

        System.out.println("The maximum number is: " + maxNumber);
        System.out.println("The number of occurrences of the maximum number is: " + count);
    }
}
