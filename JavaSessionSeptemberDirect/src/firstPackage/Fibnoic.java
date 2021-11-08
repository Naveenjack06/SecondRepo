package firstPackage;

public class Fibnoic {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;// c=2

			System.out.println(c);
			a = b; // a=1
			b = c;// b=2

		}

	}

}
