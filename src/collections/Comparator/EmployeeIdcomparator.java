package collections.Comparator;

import java.util.Comparator;

public class EmployeeIdcomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		if (s1.empId == s2.empId) {
			return 0;
		} else if (s1.empId > s2.empId) {
			return 1;
		}
		return -1;
	}

}
