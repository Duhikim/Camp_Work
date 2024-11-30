package CompanyMembers;


public class Members {
    public static void main(String[] args) {
    		
    	Employee member01 = new Employee("Mike", 5000);
    	Admin member02 = new Admin("Mike", 5000, "Admin");
    	
    	member01.showInfo();
    	member02.showInfo();
    }
}