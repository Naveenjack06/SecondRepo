package firstPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Jack");
		Stringslist.add("Bruce");
		Stringslist.add("Tom");
		Stringslist.add("Jerry");

		System.out.println("List before reversing");  
		  Collections.reverse(Stringslist);
		  System.out.println("List after reversing"); 
		 }
		}