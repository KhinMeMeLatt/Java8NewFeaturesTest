package doublecolon;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {

	void printFun(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		MethodRef mr=new MethodRef();
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.forEach(System.out::println);
        list.forEach(mr::printFun);
	}
}
