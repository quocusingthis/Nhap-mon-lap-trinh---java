package java0510;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char kyTu = sc.next().charAt(0);
        sc.close();
        
        int maHoa = (int) kyTu;
        System.out.println("Mã ASCII cho ký tự " + kyTu + " là: " + maHoa);
    }
}
