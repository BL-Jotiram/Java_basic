
public class Calculation {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++){
			System.out.println("Index " + i + " => " + args[i]);
		}
		additionOfNum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		additionOfNum(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		additionOfNum(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
	}

	public static void additionOfNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result====>" + result);
	}
}
