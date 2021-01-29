package doublecolon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InheritanceTest extends Inheritance {

	@Override
	int addSomeValue(int num) {
		Function<Integer, Integer> func = super::addSomeValue;
		int newValue = func.apply(num);
		newValue++;
		System.out.println(newValue);
		return newValue;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        list.add(3);
        list.forEach(new InheritanceTest()::addSomeValue);
	}

}
