package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayRetrieve {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");
		Stringslist.add("Ironman");
		Stringslist.add("Batman");

		System.out.println(Stringslist);

		String element = Stringslist.get(0);
		System.out.println("First element: " + element);
		element = Stringslist.get(2);
		System.out.println("Third element: " + element);
	}
}
