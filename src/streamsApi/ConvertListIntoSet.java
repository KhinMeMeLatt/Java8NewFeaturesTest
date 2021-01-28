package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListIntoSet {

	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("Orange",500,20));
		fruitsList.add(new Fruit("grape",1000,1));
		
		Set<String> fruitNames = fruitsList.stream()
				.filter((fruit) -> fruit.getName().contains("a"))
				.map((fruit) -> fruit.getName()).collect(Collectors.toSet());
		
		fruitNames.forEach(System.out::println);
	}
}
