
public class Employee {

	private String firstname;
	private String lastname;
	private double salary;
	
	public Employee()
	{
		firstname=null;
		lastname=null;
		salary=0.0;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
