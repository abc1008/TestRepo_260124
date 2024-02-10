package abstract_discussion;

public abstract class AB1 {
	
	int a = 10;
	
	public AB1()
	{
		System.out.println("Constructor of class AB1");
	}

	
	// class and method
	
	public void m1()  // concrete method = complete method
	{
		System.out.println("m1 method");
	}
	
	
	public abstract void m2();    // abstract method = incomplete method
	
	public abstract void m3(); 
	public abstract void m4(); 
	
	
	

}
