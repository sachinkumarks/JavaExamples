package collections.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		return s1.DOB.compareTo(s2.DOB);

	}

}
