package java0510;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên nhân viên: ");
        String tenNhanVien = sc.nextLine();
        System.out.print("Nhập số giờ làm việc trong một tuần: ");
        double soGioLamViec = sc.nextDouble();
        System.out.print("Nhập mức lương theo giờ: $");
        double mucLuongGio = sc.nextDouble();
        System.out.print("Nhập tỷ lệ khấu trừ thuế liên bang (dưới dạng số thập phân): ");
        double tyLeKhauTruLienBang = sc.nextDouble();
        System.out.print("Nhập tỷ lệ khấu trừ thuế tiểu bang (dưới dạng số thập phân): ");
        double tyLeKhauTruTieuBang = sc.nextDouble();

        sc.close();

        double tongLuong = soGioLamViec * mucLuongGio;
        double khauTruLienBang = tongLuong * tyLeKhauTruLienBang;
        double khauTruTieuBang = tongLuong * tyLeKhauTruTieuBang;
        double khauTruTongCong = khauTruLienBang + khauTruTieuBang;
        double tongLuongSauKhauTru = tongLuong - khauTruTongCong;

        System.out.println("\n\n-->");
        System.out.println("Họ và tên nhân viên: " + tenNhanVien);
        System.out.println("Giờ làm việc: " + soGioLamViec);
        System.out.println("Mức lương: $" + mucLuongGio);
        System.out.println("Tổng mức lương: $" + tongLuong);
        System.out.println("Các khoản khấu trừ:");
        System.out.println("  Khấu trừ Liên bang (" + (tyLeKhauTruLienBang * 100) + "%): $" + khauTruLienBang);
        System.out.println("  Khoản khấu trừ của Tiểu bang (" + (tyLeKhauTruTieuBang * 100) + "%): $" + khauTruTieuBang);
        System.out.println("  Tổng số khấu trừ: $" + khauTruTongCong);
        System.out.println("Tổng số tiền lương nhận được: $" + tongLuongSauKhauTru);
    }
}
