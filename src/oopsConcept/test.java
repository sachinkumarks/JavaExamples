package oopsConcept;

public class test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setCompany("Cognizant");
		emp.setEmpName("Sachin");
		emp.setEmpId(2239635);
		emp.setSalary(86000.24);;
		emp.setLocation("Bangalore");
		emp.getempDetails();
		System.out.println(emp.getdomainDetails("Telecom Domain"));
		System.out.println(emp.getCompany() + " " + emp.getEmpName() + " " + emp.getEmpId() + " " + emp.getSalary()+ " " + emp.getLocation());

	}

}
