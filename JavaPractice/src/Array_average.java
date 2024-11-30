
import java.io.*;

public class Array_average {
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
				
		int[] numbers = {11, 21, 31, 41, 51, 61, 71, 81, 91, 101};
		
		System.out.println("배열이 {11, 21, 31, 41, 51, 61, 71, 81, 91, 101} 로 변경되었습니다.");
		
		float sum=0;
		for(int i=0; i<10; i++) {
			sum += (float)numbers[i];
		}
		System.out.println("배열의 평균은 " + (sum/10) + "입니다.");
		
	}
}
