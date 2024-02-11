package typecasting_discussion;

public class Class1 {
	
	
	
	public static void main(String[] args) {
		
		
		// byte < short <int < long < float < double
		
		
		
		
		byte byteNum = 10;  // into int
		
		int intNum = (int)byteNum;  // Converting lower order data type into higher order 

		
		System.out.println(intNum);
		
		long longNum = (long)intNum;
		
		System.out.println(longNum);
		
		
		 double rr = (double)intNum;
		 System.out.println(rr);
		 
		 
		 
		//  Byte Range:   +127  to  -128
		 
		 // -128 , -127 ... 0, 1 , 2 , 3 .. ,127, 128 
		 
		 
		 int s = 129;    // higher order data type into lower order data type 
		 
		 byte byteNum2 = (byte)s;
		 System.out.println(byteNum2); 
		 
		
	}
	
	
	
	
	
	
	
	
	
	

}
