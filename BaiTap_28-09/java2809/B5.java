package java2809;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn chế độ chuyển đổi:");
        System.out.println("1. VND --> USD");
        System.out.println("2. USD --> VND");
        System.out.print("Nhập lựa chọn (1 hoặc 2): ");
        int luaChon = sc.nextInt();

        double usd, vnd;
        switch(luaChon) {
	        case 1:
	        	System.out.print("Nhập số tiền VND: ");
	            vnd = sc.nextDouble();
	            usd = vnd / 23500;
	            System.out.println("Số tiền tương đương trong USD: " + usd);
	            break;
	        case 2:
	        	System.out.print("Nhập số tiền USD: ");
	        	usd = sc.nextDouble();
	            vnd = usd * 23500;
	            System.out.println("Số tiền tương đương trong VND: " + vnd);
	            break;
	        default:
	        	System.out.println("Lựa chọn không hợp lệ. Hãy chọn 1 hoặc 2.");
        }
        
        System.out.println("Kết thúc chương trình.");
        sc.close();
    }
}
