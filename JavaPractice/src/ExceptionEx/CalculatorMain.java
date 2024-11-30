package ExceptionEx;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 숫자를 입력하세요: ");
			double num1 = Double.parseDouble(scanner.nextLine());
			
			System.out.print("연산자를 입력하세요. (+, -, *, /): ");
			char operator = scanner.nextLine().charAt(0);
			
			System.out.print("두 번째 숫자를 입력하세요: ");
			double num2 = Double.parseDouble(scanner.nextLine());
			
			double result = calculate(num1, num2, operator); 
			
			System.out.println("\t= " + result);
			
		} catch(NumberFormatException e) {
			System.out.println("에러 발생: 지원하지 않는 입력값입니다. 숫자를 입력해주세요. ");
		} catch(IllegalArgumentException e) {
			System.out.println("에러 발생: " + e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("에러 발생: " + e.getMessage());
		} finally {
			System.out.println("종료");
			scanner.close();
		}
	}
	
	public static double calculate(double num1, double num2, char operator) {
		switch (operator) {
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
		case '*':
			return num1*num2;
		case '/':
			if(num2==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
			return num1/num2;
		default:
			throw new IllegalArgumentException("유효한 연산자가 아닙니다. 지원하는 연산자는 +, -, *, / 입니다.");
				
		}
	}	
}
