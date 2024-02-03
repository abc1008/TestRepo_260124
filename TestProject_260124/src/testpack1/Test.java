package testpack1;

public class Test {
	
	int num2 = 20;   // non-static
	static int num3 = 90;
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		System.out.println(t1.num2);
		
		Test t2 = new Test();
		System.out.println(t2.num2);
		
		Test t3 = new Test();
		System.out.println(t3.num2);
		
		System.out.println("***************");
		
		t2.num2 = 50;
	
		System.out.println(t1.num2);
		System.out.println(t2.num2);
		System.out.println(t3.num2);
		
		
		System.out.println("**** Static Calling ********** ");
		
		System.out.println(t1.num3);
		System.out.println(t2.num3);
		System.out.println(t3.num3);
		
		System.out.println("************** ");
		
		t2.num3 = 80;
		System.out.println(t1.num3);
		System.out.println(t2.num3);
		System.out.println(t3.num3);
		
		
		
	}
	
	
	
	
	
	
	

}
