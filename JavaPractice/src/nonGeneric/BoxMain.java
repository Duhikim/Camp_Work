package nonGeneric;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동"); // String -> Obejct ( 타입 자동 변환 )
		
		String name = (String)box.getObject(); // Object -> String ( 타입 강제 변환 )
		System.out.println(name);
		
		box.setObject(new Apple());; // Apple -> Object (자동 타입 변환)
		Apple apple = (Apple)box.getObject(); // Object -> Apple (타입 강제 변환)
		System.out.println(apple);
	}

}
