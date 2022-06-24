package learn;

import java.util.ArrayList;
import java.util.Collections;

public class HashCodeDemo {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>arr= new ArrayList<>();
		arr.add(20);
		arr.add(30);
		Collections.sort(arr,Collections.reverseOrder());
		
		
			System.out.print(arr);
	
	}
}
