package LambdaCalc;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaMain {

	public static void main(String[] args) {
		// 사용자로부터 두 개의 숫자와 연산자를 입력받습니다. 람다 표현식을 사용하여 입력받은 숫자와 연산자에 따른 계산 기능을 구현합니다. 
		// 계산 결과를 출력합니다. 결과물로 사용자 입력을 받아 람다 표현식으로 구현된 계산 기능을 수행하는 스크린샷을 제출합니다.
		
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
	        // 사용자 입력 받기
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        // 람다 표현식을 사용하여 연산자에 따라 계산 수행
	        BiFunction<Double, Double, Double> calculation;

	        switch (operator) {
	            case '+':
	                calculation = (a, b) -> a + b;
	                break;
	            case '-':
	                calculation = (a, b) -> a - b;
	                break;
	            case '*':
	                calculation = (a, b) -> a * b;
	                break;
	            case '/':
	                calculation = (a, b) -> {
	                    if (b == 0) {
	                        throw new ArithmeticException("Division by zero is not allowed.");
	                    }
	                    return a / b;
	                };
	                break;
	            default:
	                System.out.println("Invalid operator.");
	                scanner.close();
	                return;
	        }

	        // 계산 및 출력
	        try {
	            double result = calculation.apply(num1, num2);
	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		 }
	       //scanner.close();		
	}

}
