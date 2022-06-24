package learn;

public class ThreadC extends Thread {

	
public void getThread2()
	
	{    System.out.println("Hi i m thread22222 ");
		for (int i=0;i<10;i=i+2)
		{
			System.out.println("thread 2 "+i);
			
		}
		
	}

public void run() {
	getThread2();
	
}
}

class ThreadD extends Thread{
	
	public void getThread1() {
         System.out.println("Hi i m thread1 ");
		
		for (int i =0;i<=5;i++)
		{
			System.out.println("thread 1 "+i);
		}
	
	}
	public void run() {
		getThread1();
		
	}
}

class DemoThread
{
	public static void main(String[] args) {
		ThreadC c= new ThreadC();
		ThreadD d= new ThreadD();
		c.start();
		d.start();
	}
}
