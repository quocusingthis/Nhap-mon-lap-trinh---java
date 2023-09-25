package java2609;

import java.util.Scanner;

public class B4 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giây: ");
        int tongsoGiay = scanner.nextInt();
        int gio = tongsoGiay / 3600;
        int giayConLai = tongsoGiay % 3600;
        int phut = giayConLai / 60;
        int giay = giayConLai % 60;
        System.out.println(gio + " giờ " + phut + " phút " + giay + " giây");
        scanner.close();
    }
}
