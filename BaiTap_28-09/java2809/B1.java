package java2809;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap nam sinh: ");
		int namsinh = sc.nextInt();
		int congiap = namsinh % 12;
		if(congiap < 0) {
			congiap += 12;
		}

		switch (congiap) {
		case 0:
			System.out.println("Bạn là tuổi khỉ");
			break;
		case 1:
			System.out.println("Bạn là tuổi gà");
			break;
		case 2:
			System.out.println("Bạn là tuổi chó");
			break;
		case 3:
			System.out.println("Bạn là tuổi lợn");
			break;
		case 4:
			System.out.println("Bạn là tuổi chuột");
			break;
		case 5:
			System.out.println("Bạn là tuổi trâu");
			break;
		case 6:
			System.out.println("Bạn là tuổi hổ");
			break;
		case 7:
			System.out.println("Bạn là tuổi mèo");
			break;
		case 8:
			System.out.println("Bạn là tuổi rồng");
			break;
		case 9:
			System.out.println("Bạn là tuổi rắn");
			break;
		case 10:
			System.out.println("Bạn là tuổi ngựa");
			break;
		case 11:
			System.out.println("Bạn là tuổi dê");
			break;
		}
		System.out.println("Kết thúc");
	}
}
