package SortEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortExMain {

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("배열의 크기를 입력하십세요.");
		int size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println((i+1) + " 번째 정수를 입력하세요.");
			numbers[i] = Integer.parseInt(br.readLine());
		}
		showArr(numbers);
		bubbleSort(numbers);
		selectSort(numbers);
	}
	
	
	public static void showArr(int[] arr) {
		int size = arr.length;
		System.out.println("입력된 배열은 다음과 같습니다.");
		System.out.print("{");
		for(int i=0; i<size; i++) {
			System.out.print(" " + arr[i]);
			if(i!=size-1) {
				System.out.print(" ,");
			}
		}
		System.out.println("}");
	}
	public static int[] bubbleSort(int[] arr) {
		int size = arr.length;
		int swapCount = 0, compCount = 0, swapCount_prev = 0;
		int[] answer = arr;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				compCount++;
				if(answer[j]>answer[j+1]) {
					int temp = answer[j];
					answer[j] = answer[j+1];
					answer[j+1] = temp;
					swapCount++;
				}				
			}
			if(swapCount==swapCount_prev) break; // 교체가 없었다면 종료.
			swapCount_prev = swapCount;
		}
		System.out.println("버블 정렬이 완료되었습니다. " + compCount + " 번의 비교 연산과 " + swapCount + " 번의 교환 연산이 있었습니다.");
		showArr(answer);
		return answer;
	}
	public static int[] selectSort(int[] arr) {
		int size = arr.length;
		int swapCount = 0, compCount = 0;
		int[] answer = arr;
		
		for(int i=0; i<size; i++) {
			int min_idx=i;
			for(int j=i; j<size; j++) {
				compCount++;
				if(answer[j]<answer[min_idx]) {
					min_idx = j;					
				}
			}
			int temp= answer[i];
			answer[i] = answer[min_idx];
			answer[min_idx] = temp;
			swapCount++;
		}
		System.out.println("선택 정렬이 완료되었습니다. " + compCount + " 번의 비교 연산과 " + swapCount + " 번의 교환 연산이 있었습니다.");
		showArr(answer);
		return answer;
	}
}