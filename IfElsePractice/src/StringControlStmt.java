import java.util.Scanner;

public class StringControlStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter yes, no, or maybe");

		String userInput = scan.nextLine();

		if (userInput.equalsIgnoreCase("yes")) {
			System.out.println("You entered: yes");
		} else if (userInput.equalsIgnoreCase("no")) {
			System.out.println("You entered: no");
		} else if (userInput.equalsIgnoreCase("maybe")) {
			System.out.println("You entered: maybe");
		}
		scan.close();

	}
}

