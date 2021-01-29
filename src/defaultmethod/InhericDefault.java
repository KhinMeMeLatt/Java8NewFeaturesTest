package defaultmethod;

interface MorningGreetingInterface{
	
	default void greet(String name) {
		System.out.println("Good Morning, "+name+"!");
	}
}

interface AfternoonGreetingInterface{
	default void greet(String name) {
		System.out.println("Good Afternoon, "+name+"!");	
	}
}

public class InhericDefault implements MorningGreetingInterface, AfternoonGreetingInterface {

	@Override
	public void greet(String name) {
		MorningGreetingInterface.super.greet(name);
		AfternoonGreetingInterface.super.greet(name);
	}
	
	public static void main(String[] args) {
		InhericDefault inhericDefaultTest = new InhericDefault();
		inhericDefaultTest.greet("Harry");
	}

}
