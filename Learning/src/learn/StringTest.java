package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringTest  {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		List<Integer>aab= new ArrayList<>();
		
		
		aab.add(2);
		aab.add(3);
		aab.add(33);
		aab.add(32);
	System.out.println(	aab.subList(1, 2));
	Map<String , Integer>mopy= new TreeMap<>();
	  mopy.put("Lkajs", 12);
	  mopy.put("snkj",1666);
	  mopy.put("sdsad", 19);
	  
	  System.out.println(mopy);
		Collections.sort(aab);
		
		
		for(Map.Entry<String,Integer>mo:mopy.entrySet())
		{
			
		}
		
		{
			for(int i=0;i<aab.size();i++)
			{
				
				System.out.println("  sorted list"+aab.get(i));
			}
		}
		
		 int xx=1;
	      for (int i=1;i<128;i++)
	      {
	          xx=xx+1;
	          
	      }
	      System.out.println(xx);    
	
		int[]a= {1,55,99,33,90};
		int temp=0;
			
		for (int i = 0; i <a.length; i++) {     
		    for (int j = i+1; j <a.length; j++) {     
		        if(a[i] < a[j]) {      //swap elements if not in order
		           temp = a[i];    
		           a[i] = a[j];    
		           a[j] = temp;    
		        }
	}

}
		
		
		//Arrays.sort(a);
		
		System.out.println("sorted---> "+ a);
		
		System.out.println("HIIIIIIIIIIIIIIIII");
		
		
		//Arrays.sort(a);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("sorttted one  "+a[i]);
		}
			
		/*
		 * for(int i :a) { System.out.println(i); }
		 */
		System.out.println(a[a.length-2]);
		
	
		
		 int count=0;
		 
		 
		int arr[]= {1,0,6,0,4,0,3};
		
		int n=arr.length;
		
		for (int i = 0; i < n; i++)
		{
            if (arr[i] != 0)
                arr[count++] = arr[i];
		}             
 
        
        while (count < n)
        {
            arr[count++] = 0;
    }
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	
	Map<String, Integer> mapc= new HashMap<String ,Integer>();
    String str= "hghgduyduewdtewdjjhjffd";
    char[] ch=str.toCharArray();
   
    
    
    String str2="my name is llakshmi";
    String[] sp=str2.split(" ");
    for(int i=sp.length-1;i>=0;i--)
    {
    	System.out.print(sp[i]+" ");
    			
    }
    
    String rev="world";
    String reverse="";
    
    for(int i =rev.length()-1;i>=0;i--)
    {
    	reverse=reverse+rev.charAt(i);
    }
    
    System.out.println(reverse);
   
    
    String[] strarr= {"java","java","sql"};

StringBuffer str1 	= new StringBuffer("lakshmi");
str1.reverse();


String aaa= "owl";
System.out.println(aaa.substring(0, 2));
String aabe="owl";
String aa=new String("owl");

System.out.println(aaa==aabe);

System.out.println("AA AND AAA comapre:::"+ aaa.equals(aa));

for (String st:strarr)
{
	
	
	 
	if (mapc.containsKey(st))
	{
		mapc.put(st, mapc.get(st)+1);
	
}
	else
	{
		mapc.put(st, 1);
	}


}

System.out.println(mapc);
	



int [] list= {1,3,4,5,6,1};


  for(int i=0;i<list.length-1;i++) 
  { if(list[i+1]>list[i]) {
  System.out.println(list[i]); } }
  
 

  
for (Entry<String, Integer> mappy: mapc.entrySet())
{
	
	
	if (mappy.getValue()>1)
	{
		System.out.println(mappy.getKey());
	}
}
  


mapc.forEach((x,y)->{
		
	
	if (y>1)
		
	System.out.println("the duplicate Value is :: "+x);
	
	});		

/*
 * int count1=0; String str0="sdsg2222hjgdsjhdfd33566 ";
 * 
 * String str22[]=str0.split("[a-z]");
 * 
 * System.out.println(str22.length);
 * 
 * for (int i=0;i<str22.length-1;i++) {
 * 
 * if (!str22[i].equals(" ")) { str22[count]=str22[i]; count=count+1; } }
 * 
 * System.out.println(count);
 */
	

// removing duplicate element
String dup="";
String St1="Lakshoomiakjkj";
String s0= "lakshmi is is  my name";
String [] starr=s0.split(" ");


char[]letter= St1.toCharArray();

Set<Character>sett= new HashSet<>();

Iterator<Character>itr=sett.iterator();

int count1 =0;

while(itr.hasNext())
{
	Character c= itr.next();
}


for(Character c:letter)
{
	if(sett.add(c)==false)
	{  
		dup= dup+ c;
		count++;
		
		
	
}
}
System.out.println("dup is "+dup);
System.out.print(sett);

List<String>lis= new ArrayList<String>();
lis.add(" ");
lis.add(" ");
lis.add("aklsk");
lis.add("cc");
String stt="";
Hashtable <List<String>,Integer >htm= new Hashtable<>();


htm.put(lis, 1);

System.out.println("Hastable list @@@@@@input"+htm);


Hashtable<Character,Integer >table= new Hashtable<Character,Integer >();

for(Character c:letter)
{
	
	Integer cou= table.get(c);
	if(cou==null)
	{
		table.put(c, 1);
		
	}
	
	else {
		table.put(c, table.get(c)+1);
	}
	
}

System.out.println(table);


String oo="automation testing ";
String [] stro=oo.split(" ");
String oa=stro[0];
String o1=stro[1];
System.out.println(stro[1]);
StringBuffer buf = new StringBuffer(oa);
Arrays.asList(arr);
Arrays.sort(arr);

StringBuffer buf1 = new StringBuffer(o1);
System.out.println(buf.reverse()+" "+buf1.reverse());

//HashTable and Linked HashMap example


//HashTable

Hashtable<String, Integer>ht= new Hashtable<String, Integer>();
ht.put("hello", 99);
ht.put("there", 298);
ht.put("Today", 233);
ht.put("hello", 9);

System.out.println(ht);


// LinkedHashMap

LinkedHashMap<Map<String,Integer>, Integer>lmap= new LinkedHashMap<>();
/*
 * lmap.put("i", 101); lmap.put("am", 002); lmap.put("you", 003); lmap.put("i",
 * 199); System.out.println(lmap);
 * 
 */



lmap.put(mapc,01);
//lmap.put(mapc, 02);
System.out.println(lmap);

int n1=112;
int sum=0;
while (n1!=0)
{
	sum=sum+n1/10;
}
System.out.println(sum);

}
	
	

	
	
}
		
	
