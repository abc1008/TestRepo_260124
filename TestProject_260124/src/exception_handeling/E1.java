package exception_handeling;

public class E1 {
	
	
	
	public static void main(String[] args) {
		
		
		int a  = 10;
		int b = 0;
		
		
		System.out.println("Before Exception Handelling");
		
		try 
		{
			int c = a/b;    // risky code 
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" Exception Found : " + e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block running.");  // cleanup activities
		}
		
		System.out.println("After Exception Handelling");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
