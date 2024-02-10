package encapsulation_discussion;

public class Class_B  {

	
	
	public static void main(String[] args) {
		
		
		Class_A aa = new Class_A();

		
		System.out.println(aa.getBalance());
		
		aa.setBalance(600.00);
		System.out.println(aa.getBalance());
	}
	
	
}
