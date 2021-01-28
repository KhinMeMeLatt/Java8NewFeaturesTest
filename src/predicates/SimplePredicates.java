package predicates;

import java.util.function.Predicate;

public class SimplePredicates {

	public static void main(String[] args) {
		Predicate<Integer> isEvenNumber = (num) -> num%2 == 0;
		System.out.println(isEvenNumber.test(12));
	}

}
