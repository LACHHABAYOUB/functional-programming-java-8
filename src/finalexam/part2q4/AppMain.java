package finalexam.part2q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppMain {
	public static void main(String[] args) {
		var l1 = List.of(1, 2, 3);
		var l2 = List.of(2, 4, 6);
		System.out.println(findExclusiveNumbers(l1, l2));
	}

	/**
	 * Using Functional programming with Stream API and Lambdas to find list of
	 * exclusive numbers found in just one list
	 * 
	 * @param l1 first list
	 * @param l2 second list
	 * @return list of exclusive numbers found in just one list
	 */
	private static List<Integer> findExclusiveNumbers(List<Integer> l1, List<Integer> l2) {

		l1.stream().filter(n -> !l2.contains(n)).collect(Collectors.toList());
		l2.stream().filter(n -> !l1.contains(n)).collect(Collectors.toList());
		// return List.stream().concat(l1.stream().filter(n -> !l2.contains(n)).collect(Collectors.toList()),l2.stream().filter(n -> !l1.contains(n)).collect(Collectors.toList()));
		return  l1.stream().filter(n -> !l2.contains(n)).collect(Collectors.toList());

	}
}
