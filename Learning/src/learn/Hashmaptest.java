package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;

import com.sun.org.apache.bcel.internal.generic.AALOAD;







public class Hashmaptest {
	public static void main(String[] args) {
		
		int x= 123;
		
		
		String z= "Lakshmi";
		String zz=z.replaceAll("i", "ii");
		System.out.println(zz);
		
        Map<String,Integer> mapp= new HashMap<String,Integer>();
        mapp.put("lakshmi",100);
        mapp.put("amit",200);
        mapp.put("Harsh",300);
        mapp.put("amit",700);

        System.out.println(mapp);
        System.out.println(mapp.get("amit"));
        
       
        
        String[] str = {"lakshmi","amit","amit","lux"};
        Arrays.sort(str);  
      
    Set<String > dupset= new HashSet<>();
    
    for(String du:str)
    {
    	if(dupset.add(du))
    	{
    		System.out.println("added");
    	}
    	else {
    		
    		System.out.println("duplicate is"+du);
    	}
    	
    }
        
        
    for(String st:str)
    {
    	System.out.println(st);
    }
    
   //frequency
    
     String  random="gcydsfdkkjsnxTTTttttxiwxiwehueidewu";
    char [] words = random.toCharArray();
    
    Map<Character, Integer>mapcount = new HashMap<Character,Integer>();
     for(Character ch:words)
     {
    	 if(mapcount.containsKey(ch))
    	 {
    		 mapcount.put(ch, mapcount.get(ch)+1);
    	 }
    	 
    	 else
    	 {
    		 mapcount.put(ch, 1);
    	 }
     }
     
     System.out.println(mapcount);
     
     
     //Set<Map.Entry<Character,Integer>>mappEn=mapcount.entrySet();
     for(Entry<Character, Integer> map0:mapcount.entrySet())
     {
    	 if(map0.getValue()>1)
    	 {
    		 System.out.println(map0.getKey()+":"+map0.getValue());
    	 }
    	 
     }
     
     
     
     mapcount.forEach((k,v)->{
    	 
    	 if(v>1)
    	 {
    		 System.out.println("Key"+k+" "+"Value" +" "+v);
    	 }
    	 
     });
    
    //substring is present or not 
     
     Hashtable<Integer,String>tablehash=new Hashtable<>();
     tablehash.put( 900,"a");
     tablehash.put(901,"b");
     tablehash.put(556, "c");

     System.out.println(tablehash);
    
     
     TreeMap<Integer,String>mo= new TreeMap<>();
     mo.put(20, "l");
     mo.put(22, "a");
     mo.put(10, "e");
     
    
     
     Set<Integer>sett= mo.keySet();
     Iterator<Integer>ele= sett.iterator();
     
     while(ele.hasNext())
     {
    	System.out.println( "Keyset"+ele.next());
     }
     
     
     
     
  Collection<String> v=tablehash.values();
   
   Iterator<String>k=v.iterator();
   while(k.hasNext())
   {
	   System.out.println(k.next());
   }
   
     
     String strv= "my name is alibaba ";
     String rep1="";
     String strp="my name is alibaba ";
    
   boolean xxx=strv.matches((".*")+"ab"+(".*"));
   
   String repp= strv.replaceAll("ab+", "88");
  //replacing 
  String rep= strv.replaceAll(" ", "");
   System.out.println(rep);
   
  for(int i=0;i<strp.length();i++)
  {
	  if(strp.charAt(i)!=' ')
	  {
		  rep= rep+strp.charAt(i);
	  }
	  
  }
  System.out.println(rep);
    
   
    
    
    
    
    
    
        
        int[] arr= {7,6,0,3,2,1};
        int temp=0;
        for (int i=0;i<arr.length;i++)
        {
        
      
        	for(int j=i+1;j<arr.length;j++)
        {
        		
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	
        		
        }
        	
        	
        }
        
     
        List<Integer>list1= new ArrayList<Integer>();
        
        list1.add(100);
        list1.add(2);
        list1.add(9);
        System.out.println(list1);
       
        
        Iterator<Integer> itr0= list1.iterator();
        
        while(itr0.hasNext())
        {  System.out.println("hi i m iterator"+itr0.next());
           
        }
        		
        		
        
        Collections.sort(list1);
        System.out.println(list1);
        Arrays.sort(arr);
        
        System.out.println(arr);
        for (int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        
    }
        
	}
}
