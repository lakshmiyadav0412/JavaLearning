package learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class series {
	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z=0;
		
		
		int n=11222;
		int sum = 0;
		int count =0;
		while (n!=0)
			
		{
			int digit = n%10;
			System.out.println(digit);
			sum=sum+digit;
			n=n/10;
			count++;
			
		}
		System.out.println(sum+" <--sum and count---> "+count);
		
		
		System.out.print(x+""+y);
		
		for (int i = 2; i <6; i++) {
			
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
			
			
			
			
		
		}
		series s = new series();
		s.setStatic();	
		
		
		Queue<String> pq = new PriorityQueue<>();
		 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
       // Collections.sort();;
       // Arrays.sort();
      int[] a= {1,2,3,3};
	int[] c= {8,4,2,1,5};
	boolean b=  Arrays.equals(a, c);
	}

	
	
	public static int count=0;
	
	public void setStatic()
	{
	for (int i=0;i<3;i++)
	{
		count++;
		System.out.println(count);
	}
	}
	
}
