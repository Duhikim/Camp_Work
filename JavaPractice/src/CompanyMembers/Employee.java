package CompanyMembers;

public class Employee{
	
	private String name;
	private int salary;
	
	public Employee(String name, int sal) {
		this.name = name;
		this.salary = sal;
	}
	public void showInfo() {
		System.out.println("This person's rank is Employee.");
	}	
	
}