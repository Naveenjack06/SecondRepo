package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayUpdate {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");
		Stringslist.add("Batman");
		Stringslist.add("Superman");

		System.out.println(Stringslist);

		Stringslist.set(2, "Jerry");
		System.out.println(Stringslist);

	}

}