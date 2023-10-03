package java0510;

import java.util.Scanner;

public class B3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        System.out.print("Nhập 3 chữ cái đầu của tên tháng (viết hoa bằng tiếng anh): ");
        String thang = sc.next();

        sc.close();

        thang = thang.toLowerCase();

        switch (thang) {
        case "jan":
        	System.out.println("Tháng 1 năm " + nam + " có 31 ngày.");
        	break;
        case "mar":
        	System.out.println("Tháng 3 năm " + nam + " có 31 ngày.");
        	break;
        case "may":
        	System.out.println("Tháng 5 năm " + nam + " có 31 ngày.");
        	break;
        case "jul":
        	System.out.println("Tháng 7 năm " + nam + " có 31 ngày.");
        	break;
        case "aug":
        	System.out.println("Tháng 8 năm " + nam + " có 31 ngày.");
        	break;
        case "oct":
        	System.out.println("Tháng 10 năm " + nam + " có 31 ngày.");
        	break;
        case "dec":
        	System.out.println("Tháng 12 năm " + nam + " có 31 ngày.");
        	break;
        	
        case "apr":
        	System.out.println("Tháng 4 năm " + nam + " có 30 ngày.");
        	break;
        case "jun":
        	System.out.println("Tháng 6 năm " + nam + " có 30 ngày.");
        	break;
        case "sep":
        	System.out.println("Tháng 9 năm " + nam + " có 30 ngày.");
        	break;
        case "nov":
        	System.out.println("Tháng 11 năm " + nam + " có 30 ngày.");
        	break;

        case "feb":
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            	System.out.println("Tháng 2 năm " + nam + " có 29 ngày.");
            } else {
            	System.out.println("Tháng 2 năm " + nam + " có 28 ngày.");
            }
            break;
        default:
            System.out.println("Tên tháng " + thang + "không hợp lệ.");
    }

    }
}
