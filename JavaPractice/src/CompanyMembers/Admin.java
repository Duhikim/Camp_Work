package CompanyMembers;

public class Admin extends Employee {
	private String rank;
	
	public Admin(String name, int sal, String rank) {
		super(name, sal);
		this.rank = rank;
	}
	public void showInfo() {
		System.out.println("This person's rank is Administrator.");
	}	

}
