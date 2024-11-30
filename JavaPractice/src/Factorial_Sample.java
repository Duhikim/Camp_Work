public class Factorial_Sample {
    
	public static long Factorial(int num) {
		long answer = 1;
		
		for(int i=1; i<=num; i++) {
			answer *= i;
		}
		return answer;
	}
	
	public static void main(String[] args) {
    	
    	System.out.println(Factorial(20));
    	
    	
    }
}