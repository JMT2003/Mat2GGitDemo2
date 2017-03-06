import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 to 5");
		
		int userInput = scan.nextInt();
		
		switch (userInput) {
		case 1:
			System.out.println(userInput);
			break;
		case 2:
			System.out.println(userInput);
			break;
		case 3:
			System.out.println(userInput);
			break;
		case 4:
			System.out.println(userInput);
			break;
		case 5:
			System.out.println(userInput);
			break;
		
		default:
			System.out.println("You did not enter a number between 1 and 5");
			break;
		}
		
		
		scan.close();
		
	}

}
