package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorDemo  {

	public ComparatorDemo(int age, String name, int rollno) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}


	public int age;
	public String name;
	public int rollno;
}
	
class AgeCompare implements Comparator<ComparatorDemo> {
		
	
	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		
		if (o1.age==o2.age)
			return 1 ;
		
		else if (o1.age<o2.age)
		return 0;
		
		else 
			return -1;
	}

}




class RollNo implements Comparator<ComparatorDemo>

{

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		if (o1.rollno==o2.rollno)
		return 1 ;
	
	else if (o1.rollno<o2.rollno)
	return 0;
	
	else 
		return -1;
	}
}


class DemoMain{
	
	public static void main(String[] args) {
		
		ArrayList<ComparatorDemo>al= new ArrayList<ComparatorDemo>();
		al.add(new ComparatorDemo(32,"olly",102));
		al.add(new ComparatorDemo(12,"amy",1102));
		al.add(new ComparatorDemo(22,"loy",1022));
		al.add(new ComparatorDemo(20,"yoon",1052));
		
		Collections.sort(al,new AgeCompare()  );
		Collections.sort(al,new RollNo());
		
	  for(ComparatorDemo  c:al) {
		 System.out.println( c.age);
	  }
	}

	
		
	}
	
	

