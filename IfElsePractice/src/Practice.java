import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 - 10: ");
		
		int userInput = scan.nextInt();
		
		if (userInput <= 3 & userInput >  0){
			System.out.println("Your number is low");
		} else if (userInput >3 & userInput <=7){
			System.out.println("Your number is in the middle");
		} else if (userInput <= 10 ){
			System.out.println("Your number is high");
		} else{ 
			System.out.println("You number is not between 1 and 10");
		}
		
		
		scan.close();
	}

}
