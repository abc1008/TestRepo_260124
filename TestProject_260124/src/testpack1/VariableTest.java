package testpack1;

public class VariableTest {
	
	
	// static dataType variableName = value;
	static int num = 10;   
	
	// dataType variableName = value;
	int num2 = 20;
	
	public void m3()
	{
		System.out.println(num2);

	}
	
	public static void main(String[] args) {
		
		
		System.out.println(num);
		
		VariableTest t1 = new VariableTest();
		
		
		VariableTest t3 = new VariableTest();
		
		
		
		
		System.out.println(t1.num2);
		
		System.out.println(t1.num);  // not recomended 
		
		
		VariableTest t2 = new VariableTest();
		System.out.println(t2.num);  // not recomended  10
		t2.num = 600;    
		System.out.println(t2.num);  // not recomen  
		
		
		
		
		System.out.println(t3.num);  // not recomended 
		
		
		
		System.out.println("GIT test.");
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	

}
