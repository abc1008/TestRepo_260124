package exception_handeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E3 {
	
	public byte m2()
	{
		
		
		return 10;
	}
	
	public static void m1(int num)
	{
		System.out.println("num :" +num);
		
		if(num > 0)
		{
			num = ++num;
			m1(num);
		}

	}

	
	public static void main(String[] args) {
		
		
		m1(2);
		


		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
