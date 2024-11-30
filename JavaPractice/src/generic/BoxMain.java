package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		
		box1.setT("Hello");
		// box1.setT(10); // 컴파일 에러 발생.
		
		String str = box1.getT(); // 강제 타입 변환 없음. 원래 String임.
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(10);
		//box2.setT("안녕"); // 컴파일 에러 발생.
		
		int value = box2.getT();
		System.out.println(value);
	}

}
