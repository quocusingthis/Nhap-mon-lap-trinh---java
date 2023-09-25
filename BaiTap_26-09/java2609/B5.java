package java2609;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mức tiêu thụ nhiên liệu của xe (lít/kilomet): ");
        float mucTieuThu = scanner.nextFloat();
        System.out.print("Nhập quãng đường di chuyển (kilomet): ");
        float quangDuong = scanner.nextFloat();
        
        //Giả sử giá xăng là 23000đ/ lít
        float soLitXang = mucTieuThu * quangDuong;
        float tongTien = soLitXang * 23000;
        System.out.println("Số tiền xăng cần phải trả là: " + tongTien + " đồng");
        scanner.close();
    }
}
