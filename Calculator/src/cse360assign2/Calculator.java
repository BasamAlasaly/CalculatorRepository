//Basam Alasaly
//CSE 360 - 30399
//02-16-2019
//Assignment 2 - Calculator File

package cse360assign2;

public class Calculator
{
	private static int total;
	private static String totalReturn = new String();
	
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
		totalReturn = "0 ";
	}
	
	public int getTotal ()
	{
		return total;
	}
	
	public void add (int value)
	{
		total += value;
		totalReturn += ("+ " + value + " ");
	}
	
	public void subtract (int value)
	{
		total -= value;
		totalReturn += ("- " + value + " ");
	}
	
	public void multiply (int value)
	{
		total *= value;
		totalReturn += ("* " + value + " ");
	}
	
	public void divide (int value) 
	{
		if(value != 0)
		{
			total /= value;
			totalReturn += ("/ " + value + " ");
		}
		else
		{
			total = 0;
			totalReturn += ("/ " + value + " ");
		}
	}
	
	public String getHistory ()
	{
		return(totalReturn);
	}
}