package predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class ChainPredicates {

	public static Predicate<String> isNull = new Predicate<String>() { 
        @Override
        public boolean test(String s) 
        { 
            return Objects.nonNull(s); 
        } 
    };
    
    private static void chainPredicate(String sentence, String keyword) {
		Predicate<String> containsWord = (str1) -> str1.contains(keyword);
		System.out.println(containsWord.and(isNull).negate().test(sentence));
	}
    
	public static void main(String[] args) {
		chainPredicate("Hello World!","World");
	}

}
