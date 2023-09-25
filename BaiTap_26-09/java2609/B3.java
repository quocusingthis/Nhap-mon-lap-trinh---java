package java2609;

import java.util.Scanner;

public class B3 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá nhập hàng: ");
        float cost = scanner.nextFloat();
        System.out.print("Nhập tỷ lệ % thuế VAT: ");
        float vatRate = scanner.nextFloat();
        float vat = (vatRate / 100) * cost;
        float total = cost + vat;
        System.out.println("Giá tiền phải trả sau khi tính thuế VAT là: " + total);
        scanner.close();
    }
}
