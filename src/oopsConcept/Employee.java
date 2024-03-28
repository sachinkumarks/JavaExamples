package oopsConcept;

public class Employee {
	
	private String empName;
	private long empId;
	private String company;
	private String location;
	private Double salary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	void getempDetails(){
		System.out.println("GetempDetails from the class of Epmloyee: ");
		
	}
	
	String getdomainDetails(String doaminID){
		return "I am working in cognizant as a software developer under " + doaminID;
	}
	

}
