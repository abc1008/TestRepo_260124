package polymorphism;

public class ClassB extends ClassA 
{

	public void m1(int a, boolean b)
	{
		System.out.println("2 arg method of ClassB");
	}
	
	public void m1()
	{
		System.out.println("0 arg method of ClassB");
	}
	
	public void m2()
	{
		System.out.println("zero arg method of ClassB");
	}
	
	
	public static void main(String[] args) {
		
		
		ClassB bb = new ClassB();   // child ref child object
		bb.m1();    				// ClassA method call
		bb.m1(2);   				// ClassA method call
		bb.m1(6, false);  			// ClassB method call
		bb.m2();  					// ClassB method call
		
		ClassA aa = new ClassA();  // parent ref and parent object
		aa.m1();
		aa.m1(6);
		
		
		ClassA a = new ClassB();   // parent ref and child object 
		a.m1();  				   // ClassB method call
		a.m1(9);                   // ClassA method call
		a.m2();                    // ClassB method call
		
//		ClassB b = new ClassA();   // not possible 
	
		// m1 method = overloaded  // based on ref variable
		// m2 method = overridden  // based on object 
		
	}
	
	
	
	
	
	
	
	
}
