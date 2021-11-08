package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayEmpty {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");

		System.out.println("Original array list: " + Stringslist);
		System.out.println("Let trim to size the above array: ");
		Stringslist.trimToSize();
		System.out.println(Stringslist);
	}
}