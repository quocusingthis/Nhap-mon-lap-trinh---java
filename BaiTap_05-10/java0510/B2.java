package java0510;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chữ cái: ");
        char kyTu = sc.next().charAt(0);
        kyTu = Character.toLowerCase(kyTu);
        sc.close();
        
        if ((kyTu >= 'a' && kyTu <= 'z')) {
            if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u') {
                System.out.println(kyTu + " là một nguyên âm.");
            } else {
                System.out.println(kyTu + " là một phụ âm.");
            }
        } else {
            System.out.println("Không hợp lệ. Vui lòng nhập một chữ cái.");
        }
    }
}
