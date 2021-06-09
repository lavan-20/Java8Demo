import java.util.Scanner;

public class CalculatorDemo {

	Scanner scanner;
	
	public static String VAL = "Hello";


	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		CalculatorDemo demo = new CalculatorDemo();
		demo.calculate();
		
	}	
	
	public void calculate() {
		InputHelper helper = new InputHelper();
		String input1 = helper.getInput("First number :");
		String input2 = helper.getInput("Second number :");
		String operation = helper.getInput("Enter an operation(+ - * /) :");

		scanner.close();

		try {
			switch (operation) {
			case "+":
				System.out.println("The sum is ::" + MathHelper.findSum(input1, input2));
				break;
			case "-":
				System.out.println("The difference is ::" + MathHelper.findDiff(input1, input2));
				break;
			case "/":
				System.out.println("The quotient is ::" + MathHelper.findQuotient(input1, input2));
				break;
			case "*":
				System.out.println("The product is ::" + MathHelper.findProduct(input1, input2));
				break;
			default:
				System.out.println("Invalid operation");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input -> " + e.getMessage());
		}
	}
	

	class InputHelper {
		public String getInput(String prompt) {
			System.out.println(prompt);
			if (scanner == null) {
				scanner = new Scanner(System.in);
			}
			return scanner.next();
		}
	}
}
