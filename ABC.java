import java.util.*;

public class ABC
{

	void Generatenumber()
	{
		int counter;
		System.out.println("The numbers generated by for loop");
		for(counter=1;counter<=10;counter++)
		{
			System.out.println(counter);
		}
	}
	
	ABC()	//constructor
	{
		System.out.println("This is from the constructor");

	}
	
	public static void main(String args[])
{

	int vara, varb;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter first number:");
	vara = scn.nextInt();
	System.out.println("Enter second number:");
	varb = scn.nextInt();
	ABC obj= new ABC();
	obj.Generatenumber();	//calling of generate number
	
	}	//end of main

}	// 