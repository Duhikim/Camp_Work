package AbstractClassEx;

public class AbsClassMain {

	public static void main(String[] args) {
		Shape obj1 = new Circle(1);
		Shape obj2 = new Rectangle(2, 3);
		Shape obj3 = new Triangle(4, 5);
		
		obj1.showArea();
		obj2.showArea();
		obj3.showArea();

	}

}
