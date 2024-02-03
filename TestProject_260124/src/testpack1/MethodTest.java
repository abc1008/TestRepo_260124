package testpack1;

public class MethodTest {
	
	
//	syntax of Static Method
	
//	public static void methodName()
//	{
//	
//	
//		// method body/logic
//	
//	
//	}
	public static void printStatement()
	{
		
		System.out.println("Static method 1 from printStatement Method from MethodTest class");
		
		MethodTest tt  = new MethodTest();
		tt.m2();
		
	}
	
	
	// Syntax for Non-Static Method
	
//	public void methodName()
//	{
//		
//		// Method Body/Logic
//		
//	}
	
	public void m2()
	{
		
		System.out.println("Non-Static method m2 from MethodTest class.");
		

	}
	
	
	public void m3()
	{
		
		System.out.println("Non-Static method m3 from MethodTest class.");
//		printStatement();
		
		m2();
		
		

	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Static method 1 from main Method");
		
		// calling of static method
		printStatement();
		
		
//		// calling non-static method
//		MethodTest test = new MethodTest();
//		test.m2();   
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	

}
