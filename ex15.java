package assignment2;

import java.util.Scanner;

class employee extends Thread{
	Scanner sc=new Scanner(System.in);
	String empno, ename;
	float basic, da, hra, pf, it, gross, net;
	
	void getEmp(){
		System.out.println("Enter Employee Number: ");
		empno=sc.next();
		System.out.println("Enter Employee Name  : ");
		ename=sc.next();
		System.out.println("Enter Employee Basic : ");
		basic=sc.nextInt();
	}
	
	void calculate(){
		da =(float) ( basic * 0.3);
		hra = (float) ( basic * 0.2);
		pf = (float) ( basic * 0.5);
		it = (float) ( basic * 0.1);
		gross = basic + da + hra;
		net = gross -pf -it;
	}
	
	void displayEmp(){
		System.out.println();
		System.out.println("Employee Number: "+empno);
		System.out.println("Employee Name  : "+ename);
		System.out.println("Employee Baic  : "+basic);
		System.out.println("DA             : "+da);
		System.out.println("HRA            : "+hra);
		System.out.println("PF             : "+pf);
		System.out.println("IT             : "+it);
		System.out.println("Gross          : "+gross);
		System.out.println("Net            : "+net);
	}
	
	public void run(){
		getEmp();
		calculate();
		displayEmp();
	}
}

class student extends Thread{
	Scanner sc=new Scanner(System.in);
	String studno, name;
	int m1, m2, m3, total;
	float per;
	
	void getStudent(){
		System.out.println("Enter Student Number: ");
		studno=sc.next();
		System.out.println("Enter Student Name  : ");
		name=sc.next();
		System.out.println("Enter Mark1         : ");
		m1=sc.nextInt();
		System.out.println("Enter Mark2         : ");
		m2=sc.nextInt();
		System.out.println("Enter Mark3         : ");
		m3=sc.nextInt();
	}
	
	void calculate(){
		total = m1 + m2 + m3;
		per = total / 3;
	}
	
	void displayStudent(){
		System.out.println();
		System.out.println("Student Number: "+studno);
		System.out.println("Student Name  : "+name);
		System.out.println("Mark1         : "+m1);
		System.out.println("Mark2         : "+m2);
		System.out.println("Mark3         : "+m3);
		System.out.println("Total         : "+total);
		System.out.println("Percentage    : "+per);		
	}
	
	public void run(){
		getStudent();
		calculate();
		displayStudent();
	}
}


public class ex15
{	
	public static void main(String[] args) 
	{
		employee e1 = new employee();
		student s = new student();
		try{
			e1.start();
			e1.join();
			s.start();
			s.join();
		}catch (InterruptedException e) {
            e.printStackTrace();
	}
}
}



