package learn;

import java.util.Scanner;

public class IntegerAction {

public int getNumber()
	{
	
	System.out.println("Please enter the index");
		Scanner sc= new Scanner (System.in);
		int x= sc.nextInt();
				
		return x;
		}
	
public int printNthElement(int element,int[]arr)
 {  
	
	int temp=0;
	
       int len= arr.length;
       
       if(element>len || element<0)
    	   
    	   System.out.println("index is either negative or exceed !! plz check");
    	   
    	   else {
	
    		   temp=arr[element];
	
    	   }
		
		return temp;
	}
}


 class Maindemo

{
	public static void main(String[] args) {
		
		int[]ar= {1,3,6,4,8,34,67,6};
		IntegerAction ac = new  IntegerAction();
		ac.getNumber();
		System.out.println(ac.printNthElement(2, ar));
		System.out.println(ac.printNthElement(0, ar));
		System.out.println(ac.printNthElement(-1, ar));
		System.out.println(ac.printNthElement(9, ar));
		
		
	}
	
}