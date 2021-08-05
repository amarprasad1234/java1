package assignment2;

import java.util.Scanner;
class MyException extends Exception{}

public class ex3 {
	public static void main(String[] args) 
    {
       ex3 p = new ex3();
       Scanner sc=new Scanner(System.in);
       System.out.println("1.Built-In 2.User-Defined");
       System.out.println("Enter Choice :");
       Integer n=sc.nextInt();
       Integer tot;
       try
       {
       		if(n==1)
       		 	tot=12/0;
       		else
       		{
       			Integer num=4,den=0;
               if(den==0)
                  throw new MyException();
               else
       			   System.out.println("Result : "+ num/den);        
       		}
       }
       catch(ArithmeticException e)
       {
       		System.out.println(e);
       }   
       catch(MyException e)
       {
            System.out.println("Denominator should be > 0");
       }    
    }
}
