package polymorphism;

public class Child extends Parent {
	
	
	static int i = 18;
	
	// overridden  = overiding
	// overloaded  = overiding
	
	public static void marry()
	{
		System.out.println("marry method of Child");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Parent p = new Child();
		p.marry(); // Runtime Polymorphism / late binding
		

		marry();
		
		System.out.println(i);
		
		Child c = new Child();
		System.out.println(Parent.i);
		
		
		
	}
	
	
	
	
	
	

}
