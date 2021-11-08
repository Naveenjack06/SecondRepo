package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayExtract {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");

		System.out.println("Original list: " + Stringslist);
		List<String> subList = Stringslist.subList(0, 3);
		System.out.println("List of first three elements: " + subList);
	}

}