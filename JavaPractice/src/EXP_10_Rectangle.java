import java.io.*;

class Rectangle{
	double width;
	double height;
	
	void setWidth(int w) {
		width = w;
	}
	void setHeight(int h) {
		height = h;
	}
	double getArea() {
		System.out.println("넓이는 " + (width*height) + "입니다.");
		return (width * height);
	}
	double getPeri() {
		System.out.println("둘레는 " + (2*width + 2*height) + "입니다.");
		return (2*width + 2*height);
	}

}

public class EXP_10_Rectangle {
	
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			Rectangle rec_temp = new Rectangle();
			
			System.out.println("직사각형의 높이를 입력하세요. 음수를 입력하시면 프로그램이 종료됩니다.");
			String str = br.readLine();
			if(Integer.parseInt(str)<0) break;
			rec_temp.setHeight(Integer.parseInt(str));
			
			System.out.println("직사각형의 너비를 입력하세요. 음수를 입력하시면 프로그램이 종료됩니다.");
			str = br.readLine();
			if(Integer.parseInt(str)<0) break;
			rec_temp.setWidth(Integer.parseInt(str));
			
			rec_temp.getArea();
			rec_temp.getPeri();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
