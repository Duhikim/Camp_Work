
import java.io.*;

public class Sorting {
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers;
		numbers = new int[5];
		
		//숫자 입력받기
		for(int i=0; i<5; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(str);
			numbers[i] = num;			
		}
		
		//오름차 정렬
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}				
			}
		}
		
		//출력
		for(int i=0; i<5; i++) {
			System.out.println(numbers[i]);
		}
	}
}
