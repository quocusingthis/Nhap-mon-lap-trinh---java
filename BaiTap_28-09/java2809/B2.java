package java2809;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
        float weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng của bạn: ");
        weight = sc.nextFloat();
        System.out.print("Nhập chiều cao của bạn: ");
        height = sc.nextFloat();
        sc.close();

        float bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Bạn đang gầy.");
        } else if (bmi < 25) {
            System.out.println("Bạn đang bình thường.");
        } else if (bmi < 30) {
            System.out.println("Bạn đang thừa cân.");
        } else {
            System.out.println("Bạn đang béo phì.");
        }
    }
}
