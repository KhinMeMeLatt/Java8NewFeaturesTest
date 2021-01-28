package lambdaExpression;

@FunctionalInterface
interface AdultCheckInterface {
	String isAdult(int age);
}

public class LambdaTest {
	
	public static String checkAdult(AdultCheckInterface checker, int age) {
		return checker.isAdult(age);
	}

	public static void main(String[] args) {
		AdultCheckInterface checker = (age) -> {
			return (age>18) ? "You are an adult" : "You are a child";
		};
		System.out.println(checkAdult(checker, 20));
	}

}
