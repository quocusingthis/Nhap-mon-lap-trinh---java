package java2609;

import java.util.Scanner;

public class B2 
{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập chiều dài của hình chữ nhật: ");
    float length = scanner.nextFloat();
    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
    float width = scanner.nextFloat();
    float area = length * width;
    System.out.println("Diện tích của hình chữ nhật là: " + area);
    scanner.close();
	}
}
