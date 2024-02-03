package oops_concepts;

import access_modifiers.Modifier3;

public class Child1 extends Parent {
	
	int variableofChild1 = 80;
	static int staticvariableofChild1 = 900;
	
	int v1 = 5000;
	
	
	public Child1()  //Child class constructor always calls Prent class constructor of zero argument.
	{
		super(2,'r', true);
		System.out.println("No Argument constructor of Child1");
	}
	
	
	public Child1(char b)  
	{
	    super(2,'r');
		System.out.println("No Argument constructor of Child1");
	}
	


	public void Child1Method()
	{
		
		int v1 = 4000;
		
		System.out.println("Child1Method");
		System.out.println(this.v1);
	}
	
	public static void Child1Method_Static()
	{
		System.out.println("Child1Method_Static");
	}
	
	

	public static void main(String[] args) {
		
//		Child1 ref1 = new Child1();

		Child1 ref2 = new Child1('j');
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

	
}
