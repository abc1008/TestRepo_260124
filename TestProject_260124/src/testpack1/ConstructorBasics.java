package testpack1;

public class ConstructorBasics {

	public ConstructorBasics()
	{
		System.out.println("0 Argument Constructor");
	}
	
	public ConstructorBasics(String n1)
	{
		this();
		System.out.println("1 Argument Constructor -  String");
	}
	
	public ConstructorBasics(int num1)
	{
		this("abc");
		System.out.println("1 Argument Constructor - int");
	}
	
	public ConstructorBasics(int num1, int num2)
	{
		this(50);
		System.out.println("2 Argument Constructor");
		
	}
	
	public static void main(String[] args) {
	   ConstructorBasics c1 = new ConstructorBasics(50,90); // object creation

	   
	   
		
		

	}
	
	
	
	
	
	
	
	
	

}
