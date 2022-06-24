package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {
		
		
		List<Integer>intlist= new ArrayList<Integer>();
		intlist.add(2);
		intlist.add(7);
		intlist.add(9);
		intlist.add(7);
		intlist.add(9);
		//op 7
//1 finding duplicate element using set 		
		Set<Integer>sett= new HashSet<>();
		List<Integer> dup =new ArrayList<Integer>();
		List<Integer>distlist= new ArrayList<Integer>();
		for(Integer e:intlist)
		{
			if(sett.add(e)==false)
			{
				dup.add(e);
			}
			/*
			 * else { dup.add(e); }
			 */
			
		}
		
		System.out.println(dup+""+distlist);
		
	//2 sorting list 
		
		
		List<Integer>sortlist= new ArrayList<>();
		
		sortlist.add(20);
		sortlist.add(30);
		sortlist.add(90);
		sortlist.add(70);
		
		Collections.sort(sortlist);
		System.out.println(sortlist);
		
//3  revrese the list		
		
		Collections.reverse(sortlist);
		System.out.println(sortlist);
		
//4.conversting  list into Array 
		
		int arr[]= sortlist.stream().mapToInt(Integer::intValue).toArray();
		
		
		for(Integer e:arr)
		{
			System.out.print(e);
		}
		
		
//5.converting array into List   one way us e asList 
		
	Arrays.asList(arr);
	
for(Integer e:arr)
{
	System.out.println(e);
}



//5 b secondaway 

List <Integer >alist= new ArrayList<Integer>();
for(Integer e:arr)
{
	alist.add(e);
	
}
	}
}
