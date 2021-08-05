package assignment2;

public class ex10 {
	public static void main(String[] args) 
	{
	    Thread thread = new Thread(new child(1, 50));
	    thread.start();        
	}
}
class child extends Thread 
{
    Integer myID,limit; 
    public child(int myID, int limit) 
    {
        this.myID = myID;
        this.limit = limit;
    }
    public void run() 
    {
        if (myID > limit) 
              return;
        else 
        {
              Thread thread = new Thread(new child((myID+1), limit));
              thread.start();
              try 
              {
                  thread.join();
              } 
              catch (InterruptedException e) 
              {
              	System.out.println(e);
              }
              System.out.println("Hello from Thread :" + myID);
        }
    }

}
