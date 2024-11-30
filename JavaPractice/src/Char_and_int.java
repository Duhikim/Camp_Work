
public class Char_and_int {
	
	public static void main(String[] args) {
		System.out.println("Abc" + 1);		
		System.out.println("A" + 1);
		System.out.println('A' + 1);
		
		System.out.println('B' + 2);
		
		byte b = 127;
		b = (byte) (b+1); // overflow
		System.out.println("b = " + b);
		
		byte b2 = -128;
		b2 = (byte) (b2-1); // underflow
		System.out.println("b2 = " + b2);
		
		long L = 1234L ;
		System.out.println("L = " + L);
		
		
		
	}

}
