package assignment2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ex4 {
	void splitString(String str)
	{
		try
		{
			Pattern pattern = Pattern.compile("/");
	    	Matcher matcher = pattern.matcher(str);
	    	boolean matchFound = matcher.find();
	    	if(!matchFound) 
	      		throw new MyException(); 
	      	else
	      	{
	      		String str1[]=str.split("/");
	      		for(String a:str1)
	      			System.out.println(a +" Index :"+str.indexOf(a));
	      	}
     	}
     	catch(MyException e)
     	{
     		System.out.println("/ Not Found");
     	}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str="come/on/bro";
		ex4 p=new ex4();
		p.splitString(str);
	}

}
