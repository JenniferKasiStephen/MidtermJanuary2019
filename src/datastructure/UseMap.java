package datastructure;

import sun.nio.cs.US_ASCII;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> India = new ArrayList<String>();
		India.add("Delhi");
		India.add("Hyderabad");
		India.add("Mumbai");

		List<String> Us = new ArrayList<String>();
		Us.add("New York");
		Us.add("LA");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("India", India);
		map.put("USA", Us);

		for(Entry<String, List<String>> country:map.entrySet()) {
			System.out.println(country.getKey() +" " + country.getValue());
		}

	}

}
