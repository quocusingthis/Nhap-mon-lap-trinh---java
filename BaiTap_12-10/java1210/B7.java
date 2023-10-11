package java1010;

public class B7 {
	public static void main(String[] args) {
		System.out.println("Multiplication Table 1-->9.");
		printMultiplicationTable();
    }
	
	public static void printMultiplicationTable() {
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%d x %d = %d\n", i, j, result);
            }
            System.out.println("- - - - - - - - ");
        }
        System.out.println("Program End.");
	}
}
