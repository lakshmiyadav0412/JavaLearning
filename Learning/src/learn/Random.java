package learn;

public class Random {
	
	
	
	
	
	
	
	
	
	public int [] arry()
	{
		
		int []ar= {2,23,4,5};
		return ar;
		
	}
	

	public static void main(String str[]) {
		Random r= new Random();
		int [] in=r.arry();
	for (int i =0;i<in.length;i++)
	{
		System.out.println(in[i]); 
	}
	
int[]a= {1,55,99,33,90};
int temp=0;
	
for (int i = 0; i <a.length; i++) {     
    for (int j = i+1; j <a.length; j++) {     
        if(a[i] >a[j]) {      //swap elements if not in order
           temp = a[i];    
           a[i] = a[j];    
           a[j] = temp;    
        }

}
    
    
    
    
}

	System.out.println("lowest  "+a[0]);
	System.out.println("Highest  "+a[in.length]);


	}
}
