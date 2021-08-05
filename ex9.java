package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmpCodeException extends Exception{}

class BasicException extends Exception{}

class JobException extends Exception{}

class emp{

	Scanner sc=new Scanner(System.in);
	String eno=null,job,name;
	char ch;
	Integer len;
	float basic,da,hra,pf,it,gross,net;
	void accept() throws EmpCodeException, BasicException, JobException{
		try
		{
			System.out.println();
			System.out.println("Enter the Empno :");
			eno=sc.next();
			len=eno.length();
			if(len==5){

				boolean numflag=false, upflag=false;
				Integer flag=0;
				System.out.println();
				for (int i = 0; i < len; i++) {

					ch = eno.charAt(i);
			        if( Character.isDigit(ch)) {
			            numflag = true;
			        }
			        else if (Character.isUpperCase(ch)) {
			           upflag = true;
			        }
				}

		        if(numflag && upflag )
		        {
		            flag++;
		        }

	            if(flag==0)
	            	throw new EmpCodeException();
	            
			}else
	      		throw new EmpCodeException();
			try{
				System.out.println("Enter the Name :");
				name=sc.next();
				System.out.println("Enter the Basic :");
				basic=sc.nextFloat();
				if(basic>=2000 && basic<=7000){
					da =(float) ( basic * 0.3);
					hra = (float) ( basic * 0.2);
					pf = (float) ( basic * 0.5);
					it = (float) ( basic * 0.1);
					gross = basic + da + hra;
					net = gross -pf -it;		            
				}else
		      		throw new BasicException();
			}
			catch(BasicException e)
			{
				System.out.println("Basic Should Be Between 2000 and 7000!!");
				accept();
			}
			try{
				System.out.println("Enter the job :");
				job=sc.next();
				if("manager".equalsIgnoreCase(job)||"clerk".equalsIgnoreCase(job)||"analyst".equalsIgnoreCase(job)){
					display();
				}else
		      		throw new JobException();
			}
			catch(JobException e)
			{
				System.out.println("Job Should be either Manager or Clerk or Analyst!!");
				accept();
			}
		}
		catch(EmpCodeException e)
		{
			System.out.println("Invalid Employee Number!!");
			accept();
		}
	}

	void display(){
		System.out.println();
		System.out.println("Employee Number: "+eno);
		System.out.println("Employee Name  : "+name);
		System.out.println("Employee Baic  : "+basic);
		System.out.println("Employee Job   : "+job);
		System.out.println("DA             : "+da);
		System.out.println("HRA            : "+hra);
		System.out.println("PF             : "+pf);
		System.out.println("IT             : "+it);
		System.out.println("Gross          : "+gross);
		System.out.println("Net            : "+net);
	}
}
public class ex9
{	
	public static void main(String[] args) 
	{
		emp e1 = new emp();
		try{
		e1.accept();
		}catch(Exception e){}
	}
}
