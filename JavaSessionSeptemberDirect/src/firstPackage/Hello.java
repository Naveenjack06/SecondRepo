package firstPackage;

import java.util.HashMap;
import java.util.Map;

public class Hello {
	public static void main(String[]args) {
	String string= "Hello Java Java Java World";
	String[] str= String.toUpperCase().replaceAll("\\s+","").toCharArray();
			Map<String,Integer> map=new LinkedHashmap<>();
			for (String S:str) {
				if (map.containsKey(S)) {
					map.put(S, 1);
					
				}
				else {
					map.put(S, map.get(S)+1);
				}
			}
			System.out.println(map);
	}

			
	
	
	
	
	
	
	}
}
