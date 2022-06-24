package learn;

import java.util.Map;

public class RauktenQuestion {
	
	// whether the string is rotation of each other or not 
	
	
	public boolean isRotation(String st1,String st2)
	{
		if(st1.length()!=st2.length())
		
			
		return false;
		
		else {
		String s=st1+st1;
		int x=	s.indexOf(st2);
		System.out.println(x);
		}
	
		return true;
		
	}
	
	public static void main(String[] args) {
		
		RauktenQuestion r= new RauktenQuestion();
		r.isRotation("abcd", "cdab");
		 
		StringBuffer sb= new StringBuffer();
		sb.append("Lakshmi");
		sb.substring(1,4);
		System.out.println(sb.substring(1,4));
		
		
	}
	
	

}
