package learn;

public class ThreadA extends AbstractA implements Runnable {
  
	
	public void getThread2()
	
	{    System.out.println("Hi i m thread22222 ");
		for (int i=0;i<10;i=i+2)
		{
			System.out.println("thread 2 "+i);
			
		}
		
	}

	@Override
	public void run() {
		getThread2();
		
	}

	@Override
	public void getME() {
		// TODO Auto-generated method stub
		
	}
}
class ThreadB implements Runnable{
		
	public void getThread1() {
         System.out.println("Hi i m thread1 ");
		
		for (int i =0;i<=5;i++)
		{
			System.out.println("thread 1 "+i);
		}
	}

	@Override
	public void run() {
		getThread1();
		
	}
	
}

class DemoThreadmain
{
	public static void main(String[] args) {
		ThreadB b= new ThreadB();
		ThreadA a= new ThreadA();
		// we used runnable so 
		Thread t2 = new Thread(a);
		Thread t1 = new Thread(b);
		t1.start();
		t2.start();
	}
}
	
	
	
	
	
		
	
	

