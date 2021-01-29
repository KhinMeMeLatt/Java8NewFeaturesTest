package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import streamsApi.Fruit;

public class FunctionIdentity {

	public static void main(String[] args) {
		Function<Fruit, Fruit> funcAddTax = (Fruit f) -> {
			f.setPrice(f.getPrice()+100);
			return f;
		};
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		List<Fruit> fruitsObjList = applyIdentityToFruitList(fruitsList, funcAddTax);
		fruitsObjList.forEach(System.out::println);
	}

	private static List<Fruit> applyIdentityToFruitList(List<Fruit> fruitsList,
			Function<Fruit, Fruit> funcAddTax) {
		List<Fruit> fruitsNamesList = new ArrayList<Fruit>();
		for(Fruit fruit:fruitsList) {
			fruitsNamesList.add(funcAddTax.apply(fruit));
		}
		return fruitsNamesList;
	}
}
