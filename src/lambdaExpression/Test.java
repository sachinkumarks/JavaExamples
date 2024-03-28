package lambdaExpression;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		//interf i = (a, b) -> System.out.println("Total Sum: " + (a + b));
		//i.add(10, 20);
        
		//java7
		/*
		 * ArrayList<Integer> numbers = new ArrayList<Integer>(); numbers.add(10);
		 * numbers.add(20); numbers.add(24); numbers.add(22); numbers.add(5);
		 * numbers.add(8); numbers.add(7); System.out.println(l);
		 * 
		 * 
		 * 
		 * 
		 * ArrayList<Integer> odd = new ArrayList<Integer>(); ArrayList<Integer> even =
		 * new ArrayList<Integer>();
		 * 
		 * for (Integer s1 : numbers) { if (s1 % 2 == 0) { odd.add(s1);
		 * 
		 * }else { even.add(s1); }
		 * 
		 * } System.out.println("odd number"+ odd); System.out.println("even number"+
		 * even);
		 */
		
		
		
		//java 8
		List<Integer> numbers =List.of(1,2,3,4,5,6,7,8,9,10);

		List<Integer> even= numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("even "+ even);
		
		List<Integer> odd= numbers.stream().filter(i->i%2 !=0).collect(Collectors.toList());
		System.out.println("even "+ odd);
	}

}
