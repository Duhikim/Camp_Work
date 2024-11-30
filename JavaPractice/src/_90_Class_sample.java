class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료량은 " + this.gas + "입니다.");
	}
}

class _90_Class_sample
{
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		
		Car car2 = new Car();
		
		car2.num = 5678;
		car2.gas = 10.5;
		
		car2.show();
		
	}
}