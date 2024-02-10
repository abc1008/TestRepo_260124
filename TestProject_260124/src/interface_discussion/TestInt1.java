package interface_discussion;

public interface TestInt1 {
	
	
	// 100 % abstract
	// methods are by default public and abstract
	
	
	 int a = 10;   // by default static , public , final 
	
	 
	 
	 
	 void m1();
	
	 void m2();
	
	 void m3();
	
	
	 static void m8()
	 {
		 System.out.println("Static method of TestInt1");
	 }
	 
	public static void main(String[] args) {
		
		m8();
		
	}

}
