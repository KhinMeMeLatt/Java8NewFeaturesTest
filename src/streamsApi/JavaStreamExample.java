package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		
		List<String> fruitNames = fruitsList.stream()
				.filter((fruit) -> fruit.getName().startsWith("A"))
				.map((fruit) -> fruit.getName()).collect(Collectors.toList());
		
		fruitNames.forEach(System.out::println);
	}
}
