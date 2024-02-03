package testpack1;

public class MethodCategories {
	
	
	int u = 10;
	

	public void addition( int num1, int num2, String test)
	{
	
		int c = num1 + num2;
		
		System.out.println(c);
		
		double d = num2/num1;
		
		System.out.println(d);
		
		
		System.out.println(test);
		
	}
	
	
	
	public int subtractNums()   // build the logic
	{
		
		int a = 50;
		int b = 30;
		
		int c = a - b;
		
		
		return c;
	}
	
	
	public int multiplyNums(int num1, int num2)
	{
		int result = num1 * num2;
		
		
		return result;
	}
	
	
	public String getFName(String firstName)
	{
		
		// Concatination = Combining 2 strings
		
		String fullName = firstName + "Tendulkar";
		
		System.out.println(fullName);
		
		return fullName;

	}


	public static void main( String[] args ) {
		

		MethodCategories ref1 = new MethodCategories();
//		ref1.addition(50, 60, "abc");
		
//		int ans = ref1.subtractNums();
//		
//		int cc = ans + 50;
//		
//		System.out.println(cc);
	
//		System.out.println(ref1.multiplyNums(100, 6));
//		
//		int ans2 = ref1.multiplyNums(100, 6);
//		
//		System.out.println(ans2);
		

		
		ref1.getFName("Sachin ");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
