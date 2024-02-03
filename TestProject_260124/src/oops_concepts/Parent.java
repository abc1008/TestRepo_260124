package oops_concepts;

public class Parent{
	
	int parentVariable1 = 100;
	static int static_parentVariable1 = 200;
	
	// zero         - User Defined
	// Default - 
	// Multiple Arg

	
	
//	public Parent()
//	{
//		System.out.println("No argument constructor of Parent");
//	}
	
	public Parent(int a)
	{
		System.out.println("1 argument constructor of Parent");
	}

	public Parent(int a, char c)
	{
		System.out.println("2 argument constructor of Parent");
	}
	
	
	public Parent(int a, char c, boolean b)
	{
		System.out.println("3 argument constructor of Parent");
	}
	
	
	public void m1()
	{
		System.out.println("Method m1 of Parent");
	}
	
	public static void m2()
	{
		System.out.println("Method m2 of Parent");
	}
	
	
	
	
	public static void main(String[] args) {
		
		

		
		
	}
	
	
	
	
	

}
