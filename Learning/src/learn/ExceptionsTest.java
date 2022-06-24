package learn;

public class ExceptionsTest {
	
	public void numberGreater(int num) throws NumberGreaterThanSixException
	{
		if (num>6) {
			throw new NumberGreaterThanSixException();
			
		}
		else
		{
			System.out.println("number is less than 6");
		}
	}

	
	public static void main(String[] args) throws NumberGreaterThanSixException {
		ExceptionsTest et = new  ExceptionsTest();
		et.numberGreater(7);
		
	}
}
