package InterfaceShapeEx;

public class Triangle implements iShape{
	private int w, h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	};
	
	@Override
	public double getArea() {
		
		return w*h/2;
	}

	@Override
	public void showArea() {
		System.out.println("밑변과 높이가 " + w + " , " + h + " 인 삼각형의 면적은 " + getArea() + " 입니다.");		
	}

}
