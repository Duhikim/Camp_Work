package JavaMidLevel.StringEx;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String originalStr = br.readLine();
		char[] reverseStr = new char[originalStr.length()];
		char[] reverseCase = new char[originalStr.length()];
		for(int i=0; i<originalStr.length(); i++) {
			reverseStr[i] = originalStr.charAt(originalStr.length()-i-1);
		}
		for(int i=0; i<originalStr.length(); i++) {
			//소문자
			if(originalStr.charAt(i) >= 'a' && originalStr.charAt(i) <= 'z') {
				reverseCase[i] = (char)(originalStr.charAt(i) - 'a' + 'A');
			}
			else if(originalStr.charAt(i) >= 'A' && originalStr.charAt(i) <= 'Z') {
				reverseCase[i] = (char)(originalStr.charAt(i) - 'A' + 'a');
			}
			else {
				reverseCase[i] = originalStr.charAt(i);
			}
		}		
		System.out.println(reverseStr);
		System.out.println(reverseCase);
	}
}
