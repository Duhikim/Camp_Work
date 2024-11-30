
public class Long_and_int {
	
	public static void main(String[] args) {	
		
		
		int i=1234;
		System.out.println("i = " + i);

		long L=1234L;
		System.out.println("L = " + L);
		
		//int i2 = 1234L ; //error 발생
		//int i3 = 2_147_483_648; // error 발생
		int i4 = 2_147_483_647;
		System.out.println("i4 = " + i4);
		
		
	}

}
