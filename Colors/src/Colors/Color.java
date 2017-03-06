package Colors;

import java.util.Scanner;

enum LightColors
{
	RED, YELLOW, GREEN
}



public class Color {
	public static void main(String[] args) {
		
		LightColors color1 ;
		
		color1 = LightColors.RED;
	
		System.out.println(color1);
		
		String input;
		
		Scanner scan1 = new Scanner(System.in);
		
		input = scan1.nextLine();
		
		LightColors color2 ;
		
		try{
		
		color2 = LightColors.valueOf(input);
		
		System.out.println("Value of color2 = "+color2);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("You provided a wrong value!");
		}
		}
	}
	
	
	

