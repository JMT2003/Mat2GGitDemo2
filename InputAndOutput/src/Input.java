
import java.util.Scanner;

public class Input {
	public static void main(String[] arguments){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please Type Number: ");
	//Displays Type number to user
	
	String numberLine = sc.nextLine();
	//Gets Input from user
	
	System.out.println("Your Number Is = " + numberLine  );
	//Displays the input back to the user
	
}
}
