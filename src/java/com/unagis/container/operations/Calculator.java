package main.java.com.unagis.container.operations;

public class Calculator {
	
	public static int  add(int number1 , int number2)
	{
		
		return number1 +number2;
	}
	
	public static int subtract(int number1 , int number2)
	{
		return number1-number2;
	}
	public static int multiply(int number1 , int number2)
	{
		return number1*number2;
	}
	
	public static float divide(int number1, int number2) throws Exception
	{
		if(number2 == 0)
		{
			throw new ArithmeticException();
			
		}
		else
		return number1/number2;
		
	}
}
