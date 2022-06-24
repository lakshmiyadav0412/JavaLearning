package learn;

public class NumberDigitCount {
	public static void main(String[] args) {
		
		int number = 22555, reverse = 0;
		int count=0;  
		
		while(number != 0)   
		{  
			
		//int remainder = number % 10; 
		
		
		//reverse = reverse * 10 + remainder;
		
		number = number/10;  
		count = count+1; 
		
		} 
		
		System.out.println(count);  
		
		}  

}
