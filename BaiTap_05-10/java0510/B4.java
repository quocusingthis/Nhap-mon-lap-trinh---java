package java0510;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đầy đủ họ tên: ");
        String hoTen = sc.nextLine();
        sc.close();

        String[] parts = hoTen.split(" ");
        
        if (parts.length >= 2) {
            String ten = parts[parts.length - 1];
            String hoVaTenDem = hoTen.substring(0, hoTen.lastIndexOf(ten)).trim();
            System.out.println("Tên: " + ten);
            System.out.println("Họ và tên đệm: " + hoVaTenDem);
        } else {
            System.out.println("Tên không hợp lệ. Hãy nhập ít nhất họ và tên.");
        }
    }
}
