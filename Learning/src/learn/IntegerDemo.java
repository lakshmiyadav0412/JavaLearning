package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class IntegerDemo {
	
	public static void main(String[] args) {
		
		String s="Lakshmi";
	    Object o= s;
	    
	    if (s.equals(o))
	    {
	    	System.out.println("AAAA");
	    }
	    else
	    {
	    	System.out.println("bbbb");
	    }
	    if (o.equals(s))
	    {
	    	System.out.println("CCCC");
	    }
	    else
	    {
	    	System.out.println("DDD");
	    }
	    
	    
	    String si= new String ("LAKSHMI");
	    System.out.println(si.getClass());
	    String s2="LAKSHMI";
	    System.out.println(s2.getClass());
	    //si=si+s2;
	    System.out.println(si.getClass());
	     System.out.println(si.equals(s2));
	    
	     HashSet<Integer>el= new HashSet<Integer>();
	     el.add(23);
	     el.add(12);
	     el.add(6);
	     el.add(101);
	     //Sorting collection SET sorting via list
	     
	     List<Integer>listt= new ArrayList<Integer>(el);
	     
	     Collections.sort(listt);
	     
	     System.out.println(listt);
	     
	     //set sorting via Treemap
	    TreeSet<Integer>mappy= new TreeSet<Integer>(el);
	    
	     
	     System.out.println(mappy);
	     
	     
	    
	    
	}
	
}
