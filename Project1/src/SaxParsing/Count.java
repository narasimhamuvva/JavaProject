package SaxParsing;

import java.util.ArrayList;
import java.util.HashMap;

public class Count {
	
	public  HashMap<String, Integer> count(ArrayList<String> number ) {

		int count = 0;
		HashMap<String, Integer> stringsCount = new HashMap<String, Integer>();
		for (String s : number) {
			if (!(stringsCount.keySet().contains(s))) {
				count = 1;
				stringsCount.put(s, count);
			} else {
				count = stringsCount.get(s) + 1;
				stringsCount.put(s, count);
			}
		}
		return stringsCount;

}
}