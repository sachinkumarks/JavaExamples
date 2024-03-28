package collections.listexamples;

public class Employee {
	String empName;
	String companyName;
	int empAge;
	
	public Employee(String empName, String companyName, int empAge){
		this.empName=empName;
		this.companyName=companyName;
		this.empAge = empAge;	
		
		
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", companyName=" + companyName + ", empAge=" + empAge + "]";
	}
	

}
