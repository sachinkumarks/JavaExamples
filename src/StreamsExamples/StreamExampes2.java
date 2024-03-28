package StreamsExamples;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExampes2 {

	public static void main(String[] args) {

		//every student give grade marks
		List<Integer> marks= List.of(0,10,5,9,10);
		List<Integer> listmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(listmarks);
	}

}
