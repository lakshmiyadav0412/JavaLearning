package learn;

import java.util.ArrayList;
import java.util.Collections;

public class CompareableComparatorDemo implements Comparable<CompareableComparatorDemo>{
	
	
	public int age;
	public String name;

	public CompareableComparatorDemo(int age , String name)
	{
		this.age= age;
		this.name= name;
	}

	@Override
	public int compareTo(CompareableComparatorDemo o) {
		
		if(age>o.age )
		
		return 1;
		
		else if (age<o.age) 
			return -1;
		
		else
			return 0;
	}
	
	//for comaparabable
		
	}

class TestDemo{
	
	public static void main(String[] args) {
		
		
		ArrayList<CompareableComparatorDemo> al= new ArrayList<CompareableComparatorDemo>();
		al.add(new CompareableComparatorDemo(12, "LAKSHMI"));
		al.add(new CompareableComparatorDemo(13, "AMIT"));
		al.add(new CompareableComparatorDemo(10, "LAVMITA"));
		al.add(new CompareableComparatorDemo(22, "AMLIYA"));
		
		Collections.sort(al);
		for (CompareableComparatorDemo a:al)
		{
			System.out.println(a.age+" "+a.name );
		}
		
		
	}
}



