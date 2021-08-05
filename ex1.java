package assignment2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Integer :");
			Integer n=Integer.parseInt(sc.next());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Format Not Matching..!"+e);
		}
	}

}
