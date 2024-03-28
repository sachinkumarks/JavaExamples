package collections.examples;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {
		List<String> fruits= new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("strobery");
		fruits.add("mango");
		
		for (String fruit : fruits) {
			if (!fruit.equalsIgnoreCase("kiwi")) {
				System.out.println(fruit); 
				
			}
		}

	}

}
