package learn;

public class C  implements B {

	
	
	@Override
	public void getOk(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getB() {
		System.out.println("Hi i m justtt interface B :)");
		
	}

	@Override
	public void getStatic() {
		// TODO Auto-generated method stub
		
	}

}


class FunctionalTest{
	
	public static void main(String[] args) {
		
		
		
		A a =(x)->{
		
		System.out.println("Hi fun.interface A"+x);
				};
				
				a.getOk(10);
				
				
			//	B b= ()->{ };
				// we cannot initalize B interafce with lambda bcz only func.interface can be declared with lambda exp
					
				
		
	}
}
