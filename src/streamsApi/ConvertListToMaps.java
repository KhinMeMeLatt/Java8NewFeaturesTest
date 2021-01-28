package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMaps {

	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		
		Map<String, Integer> productPriceMap = fruitsList.stream()

			    .collect(Collectors.toMap(fruit -> fruit.getName(), fruit -> fruit.getPrice()));

		System.out.println("Fruit Names and their prices");
			  System.out.println(productPriceMap);
	}

}
