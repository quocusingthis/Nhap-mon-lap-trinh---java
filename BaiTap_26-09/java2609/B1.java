package java2609;

import java.util.Scanner;

public class B1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cm: ");
        double cm = scanner.nextDouble();
        double inch = cm / 2.54;
        System.out.println(cm + " centimet = " + inch + " inch");
        scanner.close();
    }
}
