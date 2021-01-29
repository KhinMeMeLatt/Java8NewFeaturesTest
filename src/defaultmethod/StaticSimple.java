package defaultmethod;

interface StaticSimpleTest {
	public int add(int num1, int num2);
	
	static void showAns(int ans) {
		System.out.println("The answer is "+ans);
	}
}

public class StaticSimple implements StaticSimpleTest{

	public static void main(String[] args) {
		StaticSimple test = new StaticSimple();
		StaticSimpleTest.showAns(test.add(1, 2));
	}

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
