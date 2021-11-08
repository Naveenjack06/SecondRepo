package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArraySwap {

	public static void main(String[] args) {
		ArrayList<String> ArrList = new ArrayList<String>();

		ArrList.add("Jack 1");
		ArrList.add("Bruce 2");
		ArrList.add("Tom 3");
		ArrList.add("Jerry 4");
		ArrList.add("Rock 5");

		System.out.println("Before Swap the ArrayList ");
		System.out.println(ArrList);

		Collections.swap(ArrList, 1, 2);

		System.out.println("After Swap the ArrayList");
		System.out.println(ArrList);
	}
}