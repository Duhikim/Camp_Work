
import java.io.*;

public class Plus_minus {
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("성함을 입력해 주세요.");
		String name = br.readLine();
		
		
		System.out.println("나이를 입력해 주세요.");
		String str = br.readLine();
		int age = Integer.parseInt(str);
		
		System.out.println(name + "님의 나이는 " + age + "입니다.");		
	}
}
