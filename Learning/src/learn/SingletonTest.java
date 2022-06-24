package learn;

public class SingletonTest {

	private static SingletonTest obj;
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if (obj==null)
		{
			obj=new SingletonTest();
			
			System.out.println("hi i m sigleton");
		}
		return obj;
	}
}

class SingleDemo 
{
	public static void main(String[] args) {
		SingletonTest.getInstance();
		
	}
}
