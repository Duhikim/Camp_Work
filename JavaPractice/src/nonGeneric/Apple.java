package nonGeneric;

// 제너릭을 사용하지 않는 예제
// 강제 타입 변환 발생
public class Apple {
	private Object object;
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
	@Override
	public String toString() {

		return "Apple 객체 입니다.";
	}
}
