package learn;
import java.lang.*;
public class Hello {
	
	
	int x=0;
	static int count=10;
	
	
	Hello (){
		System.out.println("from hello" + count++);
		
	}

	
	public  void drive()

     {  int x=0;
		System.out.println("overriding test");	}
	
	
	public double drive(double d)
	{
		System.out.println(x++);
		System.out.println("hi buddy");
		return d;
	}
	
	
	
}


class Bonjour extends Hello
{    
	
	static int a;
	Bonjour()
	{
	System.out.println("from boBonjour");
	
	}
	
	static
	{
		a=56890;
	}
	
	
public  static void testStatic()
{
	
	System.out.println(a);
}
	
}


class Demo{
	
	public static void main(String[] args) {
	
	Hello b2= new Hello();
	Hello b3= new Hello();
	Bonjour b= new Bonjour();
	b.testStatic();
	b3.drive();
	
	}
}
