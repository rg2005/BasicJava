import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Give first number:");
		Scanner scanner = new Scanner (System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("Give second number:");
		int secondNumber = scanner.nextInt();
		
		if(firstNumber < secondNumber) {
			System.out.println("Minimum is" + firstNumber);
			System.out.println("Maximum is" + secondNumber);
		
		}else {
			System.out.println("Maximum is" + firstNumber);
			System.out.println("Minimum is" + secondNumber);
		}
		
	}

}
