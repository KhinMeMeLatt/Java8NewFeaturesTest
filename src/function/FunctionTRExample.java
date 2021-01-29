package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import streamsApi.Fruit;

public class FunctionTRExample {

	public static void main(String[] args) {
		Function<Fruit, String> funcFruitToString = (Fruit f) -> { return f.getName();};
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		List<String> fruitNameList = convertFruitListToNamesList(fruitsList, funcFruitToString);
		fruitNameList.forEach(System.out::println);
	}

	private static List<String> convertFruitListToNamesList(List<Fruit> fruitsList,
			Function<Fruit, String> funcFruitToString) {
		List<String> fruitNameList = new ArrayList<String>();
		for(Fruit fruit:fruitsList) {
			fruitNameList.add(funcFruitToString.apply(fruit));
		}
		return fruitNameList;
	}
}
