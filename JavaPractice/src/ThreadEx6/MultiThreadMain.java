package ThreadEx6;

public class MultiThreadMain {

	public static void main(String[] args) {
		// 멀티 스레드: 여러개의 스레드 동시 실행
		Thread t1 = new MultiThread(1);
		Thread t2 = new MultiThread(2);
		Thread t3 = new MultiThread(3);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
