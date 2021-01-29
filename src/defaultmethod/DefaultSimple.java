package defaultmethod;

interface DefaultSimpleTest {
	public int add(int num1, int num2);
	
	default void showAns(int ans) {
		System.out.println("The answer is "+ans);
	}
}

public class DefaultSimple implements DefaultSimpleTest{

	public static void main(String[] args) {
		DefaultSimple test = new DefaultSimple();
		test.showAns(test.add(1, 2));
	}

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
