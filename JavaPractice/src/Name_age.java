
import java.io.*;

public class Name_age {
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		System.out.println("a 값을 입력하십시오.");
		String str = br.readLine();
		a = Integer.parseInt(str);
		
		System.out.println("b 값을 입력하십시오.");
		str = br.readLine();
		b = Integer.parseInt(str);
		
		System.out.println("a + b의 값은 " + (a+b) + "입니다.");
		System.out.println("a - b의 값은 " + (a-b) + "입니다.");
	}
}
