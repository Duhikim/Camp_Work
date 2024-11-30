public class Method_Sample {
	
	public static void checkEvenOrOdd(int number) {
		if(number %2 == 0) {
			System.out.println("짝수");
			return;
		}
		System.out.println("홀수");
		
	}
	
    public static void main(String[] args) {
    	
    	checkEvenOrOdd(4);
    	checkEvenOrOdd(7);
    	checkEvenOrOdd(8);
    	
    }
}