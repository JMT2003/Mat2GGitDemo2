import java.util.*;

	
public class TTTClass {

	
	
	public static void checkWin(int comChoice, int humChoice)
{
		public static String ValueToString(int value)
		{
			if (value==1)
				return "Rock";
			if (value==2)
				return "Paper";
			if (value==3)
				return "Scissors"
						
						
		}
		int win =0;

if (comChoice==1 && humChoice==3)
	return 1;
if(comChoice==3 && humChoice==2)
	return 1;
if (comChoice==2 && humChoice==1)
	return 1;

if (comChoice==3)

}
	
		public static void main(String [] args)
		
		
		{
			Computer computerPlayer= new Computer();
			Human humanPlayer= new Human();
			
			Scanner scn= new Scanner(System.in);
			
			humanPlayer.Name = scn.nextLine();
			
			
			int computerChoice;
			int humanChoice;
			int win;
			while (true)
			{
				humanChoice= humanPlayer.generateRoshambo();
				computerChoice= computerPlayer.generateRoshambo();
				
				win= checkWin(computerChoice, humanChoice);
				
				switch(win)
				{
				case 0:
					System.out.println("Tie!");
					TieCount++;
					break;
				case 1:
					System.out.println("Computer Won!");
					computerWins++
					break;
				case 2:
					System.out.println(humanPlayer.Name+" Won!");
					humanWins++
					break;
				
				}
				
				System.out.println("Computer choice: "+
				ValueToString(comuterChioce));
				
				System.out.println("Player choice: "+
				ValueToString(humanChoice));
				
	System.out.println("Continue playing? (N or n to exit)");
	String cont= scn.next();
	
	if (cont.compareTo("N")==0 ||cont.compareTo("n")==0)
		break;
			}
	}
}		

abstract class Player
{
	public abstract int generateRoshambo();
	public String Name;
	public int roshamboValue;
	
}
class Computer extends Player
{
	public int generateRoshambo(){
		Random rand= new Random();
		
		return rand.nextInt(3)+1;
		
	}
}
class Human extends Player
{
	public int generateRoshambo(){
		System.out.println("Please enter your choice(1=rock,2=paper,3=scissors)");
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt ();
		
		scn.hasnextint
		
		while (choice>3 || choice <1)
		{
			System.out.println("please enter a valid input!");
			choice = scn.nextInt();
			
		}
		
		return choice;
		
	}
}