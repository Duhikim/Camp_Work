package Class_Sample;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetAge() {
		return age;
	}
	
	public void TimePass() {
		this.age++;
		System.out.println("시간이 지나 나이가 한 살 늘어나서" + age + "세가 되었습니다.");		
	}
	
	public void Information() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
