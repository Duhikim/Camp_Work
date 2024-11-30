package AbstractClassEx;

public class Circle extends Shape {
	private int r;
	
	public Circle(int r) {
		this.r = r;
	};
	
	@Override
	public double getArea() {
		
		return (Math.PI*r*r);
	}

	@Override
	public void showArea() {
		System.out.println("반지름 " + r + "인 원의 면적은 " + getArea() + " 입니다.");		
	}

}
