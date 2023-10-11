package java1010;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
	        System.out.println("\nSelect mode:");
	        System.out.println("1. VND --> USD.");
	        System.out.println("2. USD --> VND.");
	        System.out.println("3. Exit the program.");
	        System.out.print("Enter selection (1, 2 or 3): ");
	        int select = sc.nextInt();
	        
	        if (select == 3) {
	        	System.out.println("\nProgram End.");
	            break;
	        }	
	        convertCurrency(select, sc);
        }
        sc.close();
    }
	
	public static void convertCurrency(int select, Scanner sc) {
		double usd, vnd;
        switch(select) {
	        case 1:
	        	System.out.print("\nEnter the amount VND: ");
	            vnd = sc.nextDouble();
	            usd = vnd / 23500;
	            System.out.println("Equivalent amount in USD: " + usd);
	            break;
	        case 2:
	        	System.out.print("\nEnter the amount USD: ");
	        	usd = sc.nextDouble();
	            vnd = usd * 23500;
	            System.out.println("Equivalent amount in VND: " + vnd);
	            break;
	        default:
	        	System.out.println("\nInvalid selection. Please choose 1, 2 or 3.");
        }
	}
}
