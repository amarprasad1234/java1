package assignment2;

import java.io.IOException;
import java.util.*; 
class queueFull extends Exception{}
class queueEmpty extends Exception{}
class queue1
{
	Integer low=0,high=0,ele,max=5;
	Integer queue[]=new Integer[max];
	Scanner sc=new Scanner(System.in);
	void insert()throws IOException
	{
		try
		{
			System.out.println("Enter the element :");
			ele=sc.nextInt();
			if(high>=max)
				throw new queueFull();
			else
			{
				queue[high++]=ele;
				System.out.println("Inserted....");
				display();
			}
		}
		catch(queueFull e)
		{
			System.out.println("Queue is Full...!");
		}
	}
	void delete()
	{
		try
		{
			if(high<=low)
				throw new queueEmpty();
			else
			{
				System.out.println("Deleted Element :"+queue[low++]);
				display();
			}
		}
		catch(queueEmpty e)
		{
			System.out.println("Queue is Empty..!");
		}
	}
	void display()
	{
		try
		{
			if(high<low)
				throw new queueEmpty();
			else
			{
				System.out.println("Queue Elements are....");
				for (Integer i=low;i<high ;i++ ) 
				{
					System.out.println(queue[i]+" ");	
				}
			}
		}
		catch(queueEmpty e)
		{
			System.out.println("Queue is Empty...!");
		}	
	}
}
class ex8 
{ 
	public static void main(String[] args) 
	{
		queue1 q=new queue1();
		Integer ch;
		Scanner sc=new Scanner(System.in);
		try
		{
			do
			{

				System.out.println("1.Insert 2.Delete 3.Exit");
				System.out.println("Enter your choice :");
				ch=sc.nextInt();
				if(ch==1)
					q.insert();
				else
					q.delete();
			}while(ch!=3);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
} 