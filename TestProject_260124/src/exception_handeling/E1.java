package exception_handeling;

public class E1 {
	
	
	
	public static void main(String[] args){
		
		
		int a  = 10;
		int b = 0;
		
		System.out.println("Before Exception Handelling");
//		int z = a + b;
//		System.out.println(z);
		
		try 
		{
			int c = a/b;    // risky code 
			
			System.out.println("");
			
			
		}
		catch (Throwable e) 
		{
			System.out.println(" Exception Found : " + e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block running.");  // cleanup activities
		}
	
		
//		Thread.sleep(5000); // 5 seconds   // multi-threading
		
		
		System.out.println("After Exception Handling");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
