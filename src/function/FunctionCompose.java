package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import streamsApi.Fruit;

public class FunctionCompose {

	public static void main(String[] args) {
		Function<Fruit, String> funFruitToString = (Fruit f)->{return f.getName();};
		Function<Fruit, Fruit> funGetFirstLetter =
				(Fruit f) -> {
					f.setName(f.getName().substring(0, 1));
					return f;
				};
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("Grape",1000,1));

		List<String> firstLetterOfFruitName = convertFruitListToLetter(fruitsList, funFruitToString.compose(funGetFirstLetter));
		firstLetterOfFruitName.forEach(str->{System.out.print(" "+str);});
	}

	private static List<String> convertFruitListToLetter(List<Fruit> fruitsList, Function<Fruit, String> funcGetFirstLetter) {
		List<String> firstLetterOfFruitName = new ArrayList<String>();
		for(Fruit fruit:fruitsList) {
			firstLetterOfFruitName.add(funcGetFirstLetter.apply(fruit));
		}
		return firstLetterOfFruitName;
	}

}
