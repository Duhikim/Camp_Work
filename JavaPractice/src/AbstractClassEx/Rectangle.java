package AbstractClassEx;

public class Rectangle extends Shape {
	private int w, h;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	};
	
	@Override
	public double getArea() {
		
		return w*h;
	}

	@Override
	public void showArea() {
		System.out.println("너비와 높이가 " + w + " , " + h + " 인 직사각형의 면적은 " + getArea() + " 입니다.");		
	}

}
