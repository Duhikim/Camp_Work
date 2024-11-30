package LambdaEx;

public class MyFunctionalInterfaceEx01 {

	public static void main(String[] args) {
		MyFnInterface01 fi;
		
		fi = () -> { 
			String str = "method call 01";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {
			String str = "method call 02";
			System.out.println(str);
		};
		fi.method();
		
		MyFnInterface01 f0 = () -> {
			String str = "method call 04";
			System.out.println(str);
		};
		f0.method();
		
		MyFnInterface02 fi2;
		
		fi2 = (x, y) -> {			
			return x+y;
		};
		System.out.println(fi2.method(2,5));
		
		fi2 = (x, y) -> x+y;
		System.out.println(fi2.method(10, 20));
		
		fi2 = (x, y) -> sum(x, y);
		System.out.println(fi2.method(11, 12));
	}
	
	
	public static int sum(int x, int y) {
		return x+y;
	}

}
