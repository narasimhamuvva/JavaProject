import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sort {
	
	public  List<String> sortingByValue(HashMap<String, Integer> hmap) {
		Map<String, Integer> map = sortByValues(hmap);
		
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.reverse(list);
		List<String> topUsers = list.subList(0, 10);
		return topUsers;
	}

	@SuppressWarnings("unchecked")
	public  Map<String, Integer> sortByValues(HashMap<String, Integer> map) {
		@SuppressWarnings("rawtypes")
		List<String> list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator<Object>() {
			@SuppressWarnings("rawtypes")
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		@SuppressWarnings("rawtypes")
		HashMap sortedHashMap = new LinkedHashMap<String, Integer>();
		for (@SuppressWarnings("rawtypes")
		Iterator it = list.iterator(); it.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}