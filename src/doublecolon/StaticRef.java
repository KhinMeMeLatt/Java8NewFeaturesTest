package doublecolon;

import java.util.ArrayList;
import java.util.List;

public class StaticRef {

	static void printFun(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.forEach(StaticRef::printFun);
	}

}
