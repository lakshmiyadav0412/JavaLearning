package learn;

public class BaseTest  extends AbstractTest{

	
	public static void main(String[] args) {
		BaseTest tt= new BaseTest();
		tt.getDet();
		tt.setVal("Helloo ther");
		tt.getDet();
	}
	@Override
	public void setVal(String x) {
		System.out.println(x);
		
		
	}
	
	/*
	 * public void getDet() { System.out.println("i am inside base"); }
	 */

}
