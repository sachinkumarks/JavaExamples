package collections.listexamples;

import java.util.ArrayList;
import java.util.List;

public class demo {

	public static void main(String[] args) {

		Employee employee = new Employee("sachin", "Cognizant", 25);
		Employee employee1 = new Employee("Vinayaka", "Cognizant", 26);
		Employee employee2 = new Employee("Vinayaka", "Cognizant", 26);

		List<Employee> empDetails = new ArrayList<>();
		empDetails.add(employee);
		empDetails.add(employee1);
		empDetails.add(employee2);

		for (Employee e : empDetails) {
			System.out.println(e);
		}

	}

}
