package StreamsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblems {

	public static void main(String[] args) {
		
		
		List<Integer> num= new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		
		List<Integer> ss=new ArrayList<>();
		for (Integer k : num) {
			ss.add(k*2);
			
		}
		System.out.println("java 7"+ss);
		
		
		
		// java8 stream API
		//Problem:- below list of integer I want make existing value into double and store into another list.
		List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(number);
		
		List<Integer> l1= number.stream().map(i-> i*2).collect(Collectors.toList());
		System.out.println(l1);

	}

}
