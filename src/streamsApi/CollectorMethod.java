package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorMethod {

	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		
		Calculation calculator = (a,b)->a*b;
		int totalAmount = fruitsList.stream()  
                .collect(Collectors.summingInt(fruit ->calculator.calculate(fruit.getPrice(), fruit.getQuantity())));
		
		double avgAmount = fruitsList.stream()  
                .collect(Collectors.averagingDouble(fruit ->calculator.calculate(fruit.getPrice(), fruit.getQuantity())));
		
		System.out.println("Total amount: "+totalAmount);
		System.out.println("Average amount: "+avgAmount);
	}
}
