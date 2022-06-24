package learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	
static int m=122;
	public static String getDeal() {
		
		String x ="hi u";
		
		return x;
		
		
		
	}

	public static void setVal()
	{
	   m=1333;
		System.out.println(m);
		
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
	List<String>arelist= new ArrayList<String>();
    arelist.add("lakshmiyadav");
    arelist.add("write");
    arelist.add("computer");
    System.out.println(arelist);
    
    String aa="ABC";
    System.out.println("substring"+aa.substring(0, 1));
    //using lambda traversal 
    
    
    System.out.println("Hi lambda traversal");
    arelist.forEach((b)->{
    	System.out.print(b+" ");
    });
    
    String str2="dhdfyducbjcksjck12345";
    //12345
    
 char[] ch=  str2.toCharArray();
 int count=0;
 char c [] = null;
 
 System.out.println();
 for(int i=ch.length-1;i>0;i--)
 {
	 
	 
	 System.out.print(ch[i]);
	
	 count=count+1;
	// c[count]=ch[i];
	 if (count==5)
		 break;
	 else
		 continue;
	 
 }
String[]ss= str2.split("[a-z]");


for(String s:ss)
{
	System.out.println("*****"+s);
}

System.out.println("replaced"+str2.replaceAll("[a-z]","" )); 

str2.replaceAll("[a-z]","" );
 
str2.matches("[0-9]+");
	
Collections.sort(arelist);
System.out.println(arelist);
HashSet<String>areset= new HashSet<String>();
areset.add("test");
areset.add("Test");
System.out.println(areset);

CollectionTest t = new CollectionTest();
t.setVal();
String s="test";
s="demo";
System.out.println(s);



System.out.println(getDeal());
 
String str="+",str1="-";



	
		String odd="+-";
		
	System.out.println(	odd.repeat(7-3)+"+");
		
	
	




    
    
}
}