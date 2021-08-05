package assignment2;

class thread11 implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("State of thread1 while it called join() method on thread2 -"+ex12.thread1.getState());
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}	
	}
}

public class ex12 implements Runnable
{
	public static Thread thread1;
	public static void main(String[] args)
	{
		ex12 obj = new ex12();
		thread1 = new Thread(obj);
		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();
		System.out.println("State of thread1 after calling .start() method on it - " +
			thread1.getState());
	}
	public void run()
	{
		thread11 myThread = new thread11();
		Thread thread2 = new Thread(myThread);
		System.out.println("State of thread2 after creating it - "+ thread2.getState());
		thread2.start();
		System.out.println("State of thread2 after calling .start() method on it - " +thread2.getState());
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("State of thread2 after calling .sleep() method on it - "+thread2.getState() );
		try
		{
			thread2.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("State of thread2 when it has finished it's execution - " +thread2.getState());
	}	
}
