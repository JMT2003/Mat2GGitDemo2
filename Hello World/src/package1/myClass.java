package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class myClass {
	
	public static void main(String[] args)
	{
		Random randomGenerator = new Random();
		
			System.out.println(randomGenerator.nextInt(3));
			
	}
	
}

abstract class Shape
{
abstract double CalculateArea();

double Area;
}

class Circle extends Shape
{
	double X,Y;
	
	double CalculateAera()
	{ Area= Math.PI* r*r;
	return Area;
	
	
	}
}