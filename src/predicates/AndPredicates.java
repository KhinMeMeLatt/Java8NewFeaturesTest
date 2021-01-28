package predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class AndPredicates {

	public static Predicate<String> isNull = new Predicate<String>() { 
        @Override
        public boolean test(String s) 
        { 
            return Objects.nonNull(s); 
        } 
    }; 
    
    private static void isContainedAndNotNull(String sentence, String keyword) {
		Predicate<String> containsWord = (str1) -> str1.contains(keyword);
		System.out.println(containsWord.and(isNull).test(sentence));
	}

	public static void main(String[] args) {
		isContainedAndNotNull("Hello World!","World");
	}
}
