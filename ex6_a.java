package assignment2;

import java.util.Scanner;

//exception doesn't occur
public class ex6_a {

	public static void main(String args[]) 
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("1st case: No Exception Occured");
	    System.out.println("2nd case: Exception Occured & Not handled");
	    System.out.println("2nd case: Exception Occured & handled");
	    System.out.println("Enter the case :");
	    Integer n=sc.nextInt();
	    if(n==1)
	    {
	      try 
	      {
	        
	        int num;
	        num = 77 / 11;
	        System.out.println("The output is =" + num);
	      } 
	      finally 
	      {
	        System.out.println("finally executed");
	      }
	      System.out.println("End of 1st case");
	    }
	    else if(n==2)
	    {
	      try 
	      {
	        
	        int num;
	        num = 30 / 0;
	        System.out.println("output is =" + num);
	      } 
	      finally 
	      {
	        System.out.println("finally executed");
	      }
	      System.out.println("End of 2nd case");
	    }
	    else
	    {
	      try 
	      {
	        int num;
	        num = 30 / 0;
	        System.out.println("output is =" + num);
	      } 
	      catch (ArithmeticException er) 
	      {
	        System.out.println(er);
	      } 
	      finally 
	      {
	        System.out.println("finally executed");
	      }
	      System.out.println("End of 3rd case");
	    }
	  }
}
