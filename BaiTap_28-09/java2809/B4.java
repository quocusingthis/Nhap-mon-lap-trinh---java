package java2809;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một năm bất kỳ: ");
        int nam = sc.nextInt();
        sc.close();

        if (kiemTraNamNhuan(nam)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }
    }

    public static boolean kiemTraNamNhuan(int nam) {
        if (nam % 4 == 0) {
            if (nam % 100 != 0 || nam % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
