package predicates;

import java.util.function.Predicate;

public class PredicatesinFunction {

	static void predict(String str, Predicate<String> predicate) {
		if(predicate.test(str)) {
			System.out.println("The sentence contains keyword");
		} else {
			System.out.println("The sentence does not contain keyword");
		}
	}
	public static void main(String[] args) {
		predict("Hello World",(str) -> str.contains("Hello"));
	}
}
