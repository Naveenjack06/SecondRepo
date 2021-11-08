package firstPackage;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {
	public static void main(String[] args) {

		Collection<Object> obj = new ArrayList<>();
		obj.add("Red");
		obj.add("Black");
		obj.add("White");
		obj.add("Green");

		System.out.println(obj);
	}
}
