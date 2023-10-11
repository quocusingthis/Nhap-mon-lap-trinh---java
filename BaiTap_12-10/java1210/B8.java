package java1010;

import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        sc.close();
        
        String reversedString = reverseString(string);

        System.out.print("\nReversed string: " + reversedString);
             
    }
	
	public static String reverseString(String inputString) {
        int length = inputString.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }

        return reversed.toString();
    }
}
