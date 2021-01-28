package predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class OrPredicates {
	
	public static Predicate<String> isNull = new Predicate<String>() { 
        @Override
        public boolean test(String s) 
        { 
            return Objects.nonNull(s); 
        } 
    }; 
    
    private static void isContainedOrNotNull(String sentence, String keyword) {
		Predicate<String> containsWord = (str1) -> str1.contains(keyword);
		System.out.println(containsWord.or(isNull).test(sentence));
	}

	public static void main(String[] args) {
		isContainedOrNotNull("Hello World!","blah");
	}
}
