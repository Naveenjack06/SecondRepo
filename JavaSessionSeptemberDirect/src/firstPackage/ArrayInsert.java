package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayInsert {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Red");
		Stringslist.add("Green");
		Stringslist.add("Blue");
		Stringslist.add("Yellow");
		Stringslist.add("Black");
		Stringslist.add("Violet");

		System.out.println(Stringslist);

		Stringslist.add(0, "Orange");
		Stringslist.add(7, "White");

		System.out.println(Stringslist);

	}

}
