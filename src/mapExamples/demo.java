package mapExamples;

import java.util.HashMap;
import java.util.Map;

public class demo {

	public static void main(String[] args) {

		Student student = new Student("sachin", "2nd PUC", 17, 2233);
		Student student1 = new Student("sachin", "2nd PUC", 17, 2233);
		Student student2 = new Student("sachin", "2nd PUC", 17, 2233);
		Student student3 = new Student("sachin", "2nd PUC", 17, 2233);

		Map<Integer, Student> map = new HashMap<>();
		map.put(1, student);
		map.put(2, student1);
		map.put(3, student2);
		map.put(4, student3);
		System.out.println(map.size());
		
		Map<Integer, String> map1= new HashMap<>();
		map1.put(1, "Value");
		map1.put(12, "Value");
		
		System.out.println(map1.size());
		

		
		for(Map.Entry<Integer, Student>entry: map.entrySet()) {
			System.out.println(entry);
			
		}

	}


}
