package java2809;

import java.util.Scanner;

public class B3 {
	public static void main(String[] args) {
        double soDien, tongTienDien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        soDien = sc.nextDouble();
        sc.close();

        tongTienDien = tinhTienDien(soDien);

        double tienDienCoVAT = tongTienDien * 1.1;
        System.out.println("Tổng tiền điện (sau khi tính thuế VAT) là: " + tienDienCoVAT + " đồng");
    }

    public static double tinhTienDien(double soDien) {
        double tongTienDien = 0;

        if (soDien <= 50) {
            tongTienDien = soDien * 1.678;
        } else if (soDien <= 100) {
            tongTienDien = 50 * 1.678 + (soDien - 50) * 1.734;
        } else if (soDien <= 200) {
            tongTienDien = 50 * 1.678 + 50 * 1.734 + (soDien - 100) * 2.014;
        } else if (soDien <= 300) {
            tongTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (soDien - 200) * 2.536;
        } else if (soDien <= 400) {
            tongTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (soDien - 300) * 2.834;
        } else {
            tongTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (soDien - 400) * 2.927;
        }

        return tongTienDien;
    }
}
