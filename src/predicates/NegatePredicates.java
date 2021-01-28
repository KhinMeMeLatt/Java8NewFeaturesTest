package predicates;

import java.util.function.Predicate;

public class NegatePredicates {

	public static void main(String[] args) {
		Predicate<Integer> unluckyNum = (num) -> num==13;
		System.out.println(unluckyNum.negate().test(12) ? "It is not an unlucky number" : "It is an unlucky number");
	}

}
