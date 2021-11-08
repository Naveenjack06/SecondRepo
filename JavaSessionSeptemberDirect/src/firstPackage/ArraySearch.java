package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArraySearch {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");

		if (Stringslist.contains("Jack")) {
			System.out.println("Found the element");
		}

		else

		{
			System.out.println("There is no such element");

		}
	}
}