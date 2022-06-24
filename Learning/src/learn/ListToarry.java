package learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;

public class ListToarry {

	public static void main(String[] args) {
		
		List<Integer>a= new LinkedList<>();
		a.add(2);
		a.add(9);
		a.add(7);
		
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	Set<Integer>s= new HashSet<>();
		
		
		//a.stream().mapToDouble(Double::doubleValue).toArray();
			int [] ints = a.stream().mapToInt(Integer::intValue).toArray();
		Object[] ax= a.toArray();
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		//adding to array list 	
			ArrayList<String >arr1= new ArrayList<>();
			arr1.add("hi");
			ArrayList<String>arr2= new ArrayList<>();
			arr2.add("100");
			arr2.add("200");
			arr2.add("400");
			arr2.add("400");
			arr2.add("400");
			arr2.set(1, "300");
			arr2.remove(0);
			
			ArrayList<String>ar= new ArrayList<>();
					ar=(ArrayList<String>) arr2.clone();
					
					System.out.println("cloned"+ar);
			//arr2.replaceAll(arr2--);
			//arr2.stream().mapToInt(Integer::intValue).toArray();
			
		System.out.println(arr2.lastIndexOf(100));	
			
		ArrayList<ArrayList<String> >aar3=new ArrayList<>();
			aar3.add(arr1);
			aar3.add(arr2);
			System.out.println(aar3);
			
			
			String str="@#&@dghgfhdhgh960g";
			String fres=str.replaceAll("[@#$%^&!*][a-z]", "");
			String d=fres.replaceAll("[a-z]", "");
			System.err.println(fres.replaceAll("[a-z]", ""));
			int x=Integer.parseInt(d);
			System.out.println(x);
			
			
		}
	}

