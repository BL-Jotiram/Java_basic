import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number");
		int num1 = scanner.nextInt();
		System.out.print("Enter 2nd number");
		float num2 = scanner.nextFloat();
		additionOfNum(num1, num2);
	}

	public static void additionOfNum(int num1, float num2) {
		float result = num1 + num2;
		System.out.println("Result====>" + result);
	}


}
