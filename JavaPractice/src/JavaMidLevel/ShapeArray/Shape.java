package JavaMidLevel.ShapeArray;

public class Shape {
	
	private String kind;
	private double _unit;
	private double area;
	
	public Shape(String kind, double _unit) {
		this.kind = kind;
		this._unit = _unit;
		if(kind.equals("square")) {
			this.area = _unit*_unit;
			return;
		}
		if(kind.equals("circle")) {
			this.area = Math.PI*_unit*_unit / 4;
			return;
		}
		if(kind.equals("triangle")) {
			this.area = _unit*_unit / 2;
			return;
		}
		System.out.println("Else shape");
		return;
	}
	public String toString() {
		
		return ("[ 도형 종류 : " + kind + " , 도형의 기본 단위 : " + _unit + " , 도형의 면적 : " + area + " ]");
	}	
	public static void main(String[] args) {
		Shape[] objs = new Shape[3];
		
		objs[0] = new Shape("square", 1);
		objs[1] = new Shape("circle", 2);
		objs[2] = new Shape("triangle", 3);
		for(int i=0; i<3; i++) {
		System.out.println(objs[i]);
		}		
	}
}
