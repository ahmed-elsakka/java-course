import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day of the week (1-7): ");
		int dayNumber = scanner.nextInt();
		
		String dayName;
		
		switch (dayNumber) {
		 case 1:
			 dayName = "Monday";
			 break;
		 case 2:
			 dayName = "Tuesday";
			 break;
		 case 3:
			 dayName = "Wedensday";
			 break;
		 case 4:
			 dayName = "Thursday";
			 break;
		 case 5:
			 dayName = "Friday";
			 break;
		 case 6:
		 case 7:
			 dayName = "Weekend";
			 break;
		default:
			dayName = "Invalid day number";
			break;
		}
		
		System.out.println("The day name is: " + dayName);

	}

}
