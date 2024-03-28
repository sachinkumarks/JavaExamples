package collections.Comparator;

public class Employee {
	String empName;
	String company;
	String DOB;
	int salary;
	int empId;
	String designation;

	public Employee(String empName, String company, String DOB, int salary, int empId, String designation) {
		this.empName = empName;
		this.company = company;
		this.designation = designation;
		this.DOB = DOB;
		this.empId = empId;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", company=" + company + ", DOB=" + DOB + ", salary=" + salary
				+ ", empId=" + empId + ", designation=" + designation + "]";
	}

}
