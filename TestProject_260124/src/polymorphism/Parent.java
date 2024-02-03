package polymorphism;

public class Parent {
	
	static int i = 10;
	
	
	private void home()
	{
		System.out.println("0 arg home method of parent");
	}
	
	public void home(int a)
	{
		System.out.println("1 arg home method of parent");

	}
	
	void home(int a, boolean b)
	{
		System.out.println("home method of parent");

	}
	
	public void car()
	{
		System.out.println("car method of Parent");
	}
	
	
	public static void marry()
	{
		System.out.println("marry method of Parent");
		
	}
	
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		p.home(9, false);  // compiletime polymorphism / early binding
		
		
	}
	
	

}
