package learn;

public class CloneDemo implements Cloneable{
	int rollno;  
	String name;  
	  
	CloneDemo(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	 public static void main(String[] args) throws CloneNotSupportedException {
		 CloneDemo c= new CloneDemo(90098, "Lakshmi Yadav");
		 CloneDemo c1= (CloneDemo) c.clone();
		 System.out.println("Original Object"+c.name+c.rollno);
		 System.out.println("Cloned Object"+c1.name+c1.rollno);
	}

}
