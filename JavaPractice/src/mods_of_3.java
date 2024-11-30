

public class mods_of_3 {
	
	public static void main(String[] args)
	{
		
		int[] numbers = new int[20];
		for(int i=0; (i+1)*11 <= 100; i++) {
			numbers[i] = (i+1)*11;
		}
		
		for(int i=0; (i+1)*11 <= 100; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
