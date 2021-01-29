package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import streamsApi.Fruit;

public class FunctionDefaultAndThen {

	public static void main(String[] args) {
		Function<Fruit, Integer> funGetPrice = (Fruit f) -> {return f.getPrice();};
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Apple",800,5));
		fruitsList.add(new Fruit("Orange",500,10));
		fruitsList.add(new Fruit("grape",1000,1));
		
		Function<Integer, Integer> addTax = (Integer tax) -> tax + 100;
		List<Integer> priceList = convertFruitToPriceList(fruitsList, funGetPrice.andThen(addTax));
		priceList.forEach(tax->{System.out.print(" "+tax);});
	}

	private static List<Integer> convertFruitToPriceList(List<Fruit> fruitsList, Function<Fruit, Integer> addTax) {
		List<Integer> priceList = new ArrayList<Integer>();
		for(Fruit fruit:fruitsList) {
			priceList.add(addTax.apply(fruit));
		}
		return priceList;
	}
}
