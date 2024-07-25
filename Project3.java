import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number in the range 2 - 20: ");
		int number = scanner.nextInt();
		
		if (number < 2 || number > 20) {
			System.out.println("Invalid value");
			return;
		}
		
		System.out.println("Using for loop");
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		System.out.println("Using while loop");
		int counter = 1;
		while (counter <= number) {
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("Using do-while loop");
		counter = 1;
		do {
			System.out.println(counter);
			counter++;
		} while (counter <= number);
		
		System.out.println("Using break statement");	
		for (int i = 1; i <= number; i++) {
			if (i == 8) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Using continue statement to print even numbers");
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

		
		
	}

}
