package InterfaceShapeEx;

public class AbsClassMain {

	public static void main(String[] args) {		
		Triangle obj1 = new Triangle(1, 2);
		Rectangle obj2 = new Rectangle(3, 4);
		Circle obj3 = new Circle(5);	
		obj1.showArea();
		obj2.showArea();
		obj3.showArea();
	}
}
