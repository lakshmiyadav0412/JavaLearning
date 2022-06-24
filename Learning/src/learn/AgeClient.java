package learn;

public class AgeClient {
	public static void main(String[] args) {
		
		 int alp []= {2,0,3,0,0,7};
	    
	     int count = 0; 
	     
	        
	        for (int i = 0; i <alp.length; i++)
	        { 
	        	if (alp[i] != 0)
	        	{  alp[count++] = alp[i]; 
	        	}
	 
	        }
	        while (count < alp.length)
	        {
	            alp[count++] = 0;
	    }
	        for (int i = 0; i <alp.length; i++)
	        System.out.print(alp[i]);
	
	        String str="hello";
	    	String rev="";
	    	for(int i=str.length()-1;i>=0;i--)
	    	{
	    		rev=rev+str.charAt(i);
	    		
	    	}
	    	
	    	System.out.println(rev);
	}
	
	
	
	}


