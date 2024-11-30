
import java.io.*;

public class Odd_even {
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("판별할 숫자를 입력하십시오. (0을 입력하면 종료됩니다.)");
			String str = br.readLine();
			int num = Integer.parseInt(str);
		
			if(num == 0) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
			}
			else {
			System.out.println(num + "은 홀수입니다.");
			}
		}
	}

}
