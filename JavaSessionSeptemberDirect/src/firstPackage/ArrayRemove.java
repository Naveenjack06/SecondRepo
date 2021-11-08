package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Tom");
		Stringslist.add("Jerry");
		Stringslist.add("Bruce");
		Stringslist.add("Jackie");
		Stringslist.add("Captain");
		Stringslist.add("Batman");

		System.out.println(Stringslist);

		Stringslist.remove(2);
		
		  System.out.println("After removing element from the list:\n"+Stringslist);


	}
}