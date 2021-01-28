package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class FindMaxMin {

	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		
		Fruit expensiveFruit = fruitsList
				   .stream().max((fruit1,
				   fruit2) -> fruit1.getPrice() < fruit2.getPrice() ? 1 : -1)
				   .get();
		
		Fruit cheapFruit = fruitsList
				   .stream().max((fruit1,
				   fruit2) -> fruit1.getPrice() > fruit2.getPrice() ? 1 : -1)
				   .get();
		
		System.out.println("The most expensive fruit is "+expensiveFruit.getName());
		System.out.println("The cheapest fruit is "+cheapFruit.getName());
	}
}
