package constructor.examples;

public class constructorclass {
	String employeename;
	String employeeCompany;
	int empId;

	constructorclass(String employeename, String employeeCompany, int empId) {
		this.employeename = employeename;
		this.employeeCompany = employeeCompany;
		this.empId = empId;

	}
	void display(){
		System.out.println(employeename+" "+employeeCompany+" "+ empId);
		
	}

}
