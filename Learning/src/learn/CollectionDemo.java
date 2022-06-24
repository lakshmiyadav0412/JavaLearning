package learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Stack<String> s= new Stack<>();
		s.push("L");
		s.push("A");
		s.push("W");
		//System.out.println(s);
		//s.pop();
		//System.out.println(s);
		s.pop();
		System.out.println(s);
	   //pop is for removing
		
		
		System.out.println(s);
		s.peek();
		System.out.println(s);
		
		//vector
	Vector<String> vc= new Vector<>();
	vc.add("12");
	vc.add("31");
	vc.add("121 ");
	System.out.println(vc);
	vc.remove(2);
	vc.indexOf("31");
	System.out.println(vc+""+vc.indexOf("yadav")+""+vc.size()+""+vc.isEmpty());
	
//PriorityQueue
	
	PriorityQueue<Integer> p= new PriorityQueue<>();
	p.add(23);
	p.add(34);
	p.add(72);
	p.add(122);
	System.out.println("queue operation"+p);
	p.hashCode();
	
    System.out.println(p.poll());//remove the first element and retrieves the first element
    System.out.println("queue operation"+p);
    System.out.println(p.peek());// Retrieve the first element and doesnot removes it
    System.out.println("queue operation"+p);
    System.out.println(p.hashCode());
	
    
    
    String str[]= {"java","python","R","python","python"};
    
    Set<String>el1= new HashSet<>();
    el1.add("h");
    el1.add("e");
    el1.add("l");
    el1.add("h");
    
  
    
    
    Set<String>el= new HashSet<>();
    
    
    int count=0;
    
   for(int i=0;i<str.length;i++)
   {  
	   if(el.add(str[i])!=true)
		   
	   { 
		   System.out.println("dup element=="+str[i]);
	   
	   }
	   
	   
	   
   }
   
   int count1=0;
    
   String []arr= new String[el1.size()];
   
   for(String w:el1)
   {
	   arr[count1]=w;
	   count1++;
   }
   
   for(String i:arr)
   {
	   System.out.println("Hi printing array from set"+i);
   }
   
   
   
   
   
   Map<String , Integer> mapc= new HashMap<>();
   
   
   for(String c:str) {
	   
	   if(mapc.containsKey(c)) {
		   mapc.put(c,mapc.get(c)+1);
	   }
	   
	   else
		   
		   
	   {
		   mapc.put(c,1);
	   }
	   
	   
   }
   
   System.out.println(mapc);
   
   
 mapc.forEach((x,y)->{
	 
	 if(y>1)
	 
		 System.out.println(x);
	 
	 
 });
 
 
    
    
    List<Integer>e= new ArrayList<Integer>();
    e.add(100);
    e.add(2);
    e.add(23);
    
    
  //  Collections.sort(e,Collections.reverseOrder());
    
    Collections.reverse(e);
    
    System.out.println(e);
    
    		
    		
    		
    
	
		
		
		
	}

}
