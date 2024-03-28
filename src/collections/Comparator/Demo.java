package collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Employee emp=new Employee("sachin", "Cognizant", "05/03/1999", 86000, 2239635, "Java developer");
		Employee emp1=new Employee("Pavan", "HCL", "21/05/2002", 35000, 1235638, "Financial analyst");
		Employee emp2=new Employee("Kiran", "Infosys", "02/07/2003", 70000, 2229635, "Vetornery Doctor");
		Employee emp3=new Employee("Nandish", "Tech-M", "05/01/2001", 38000, 3239636, "Sales distributer");
		Employee emp4=new Employee("Vishwas", "TCS", "23/07/2003", 50000, 1239635, "Java developer");
		
		List<Employee> listOfEmp= new ArrayList<>();
		
		listOfEmp.add(emp);
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		
		Collections.sort(listOfEmp, new EmployeeIdcomparator());
		Collections.sort(listOfEmp, new AgeComparator());
		
		for (Employee employee : listOfEmp) {
			System.out.println(employee);
		}
		

	}

}
