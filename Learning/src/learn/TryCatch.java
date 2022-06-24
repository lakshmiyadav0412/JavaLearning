package learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {
	
	public static void main(String[] args)  {
		
		try {
			
			FileInputStream Fis= new FileInputStream(new File("c://test.txt"));
			int  c= Fis.available();
			System.err.println(c);
		}
		
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IllegalAccessError e) {
			System.out.println(e);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			
		}
		
		int k=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(2*k);
				
			}
			k++;
			System.out.println(" ");
		}
		
		
	}

}
