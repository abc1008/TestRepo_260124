package testpack1;

public class Loops {
	
	int a = 80;
	static int b = 90;
	
	public void method1()
	{
		
		int num = 0;    // local variable
		System.out.println(num);
		
		int a = 100;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	
	public static void main(String[] args) {
		
		Loops vv = new Loops();
		vv.method1();
		
		
	}
	

	
	
	
	
	
	
	

}
