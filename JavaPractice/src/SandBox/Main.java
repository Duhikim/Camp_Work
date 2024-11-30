package SandBox;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		
		myArray.add(1);
		System.out.println(myArray); // 1
		myArray.add(0, 2);
		System.out.println(myArray); // 2 1
		myArray.add(1, 3);
		System.out.println(myArray); // 2 3 1
		
		myArray.add(3, 4);
		System.out.println(myArray); // ?
		
	}
}
