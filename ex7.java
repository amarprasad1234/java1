package assignment2;

import java.util.Scanner;

class LessBalanceException1 extends Exception
{
	public LessBalanceException1(String s)
	{
		super(s);
	}
}
class bank2
{
	Integer accno,balance;
	String name;
	bank2(Integer accno,String name,Integer balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	void withdraw(bank2 b1,Integer amt)
	{
		display(b1);
		try
		{
			if(b1.balance-amt<500)
				throw new LessBalanceException1("withdrawal amount "+amt+" is not valid");
			else
				b1.balance=b1.balance-amt;
			display(b1);
		}
		catch(LessBalanceException1 e)
		{
			System.out.println(e);
		}
	}
	void display(bank2 b1)
	{
		System.out.println("Name :"+b1.name);
		System.out.println("Account No :"+b1.accno);
		System.out.println("Balance :"+b1.balance);
	}
}
class bank1
{
	Integer Acno,amt,Balance,dep;
	String name;
	Scanner sc=new Scanner(System.in);
	bank1(Integer Acno,String name,Integer Balance)
	{
		this.Acno=Acno;
		this.name=name;
		this.Balance=Balance;
	}
	void deposite()
	{
		display();
		System.out.println("Enter the Amount to deposite :");
		dep=sc.nextInt();
		Balance=Balance+dep;
		display();
	}
	void withdraw()
	{
		try
		{
			System.out.println("Enter the Amount to withdraw :");
			amt=sc.nextInt();
			if(Balance-amt<500)
				throw new LessBalanceException1("withdrawal amount "+amt+" is not valid");
			else
				Balance=Balance-amt;
			display();
		}
		catch(LessBalanceException1 e)
		{
				System.out.println(e);
		}
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Account No :"+Acno);
		System.out.println("Balance :"+Balance);
	}
}
class ex7
	{
		public static void main(String[] args) 
		{
			bank1 b=new bank1(1110,"Manu",500);
			bank2 b1=new bank2(1111,"Pradeep",500);
			bank2 b2=new bank2(1112,"Sam",500);
			b.deposite();
			b.withdraw();
			b1.withdraw(b1,200);
		}	
	}

