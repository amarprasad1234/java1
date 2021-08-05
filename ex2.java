package assignment2;

import java.util.Scanner;

public class ex2 {  
	  
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Integer a[]= new Integer[5];
		String str1=null;
		String str2="abd";
		Integer n=10;
		System.out.println("1.Array 2.Arithmatic 3.Null");
		System.out.println("Enter the choice :");
		Integer ch=sc.nextInt();
		try
		{
			if(ch==1)
			{
				a[5]=10;
			}
			else if(ch==2)
			{
				Integer tot=n/0;
			}
			else
			{
				if(str1.equals(str2))
					System.out.println("Equal");
				else
					System.out.println("Not equal");
			}

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}  
