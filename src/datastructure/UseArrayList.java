package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String>  employee = new ArrayList<String>();
		employee.add("Jacob");
		employee.add("Jenny");
		employee.add("Jessy");
		employee.add("Raj");
		employee.add("Quinn");
		employee.add("Theo");
		employee.add("Vicky");
		employee.add("Richie");

		employee.remove("Richie");

		System.out.println(employee);
		for(int i=1;i<7;i++){
			System.out.println("forloop:" + employee.get(i));
		}

		Iterator<String> it =  employee.iterator();
		while(it.hasNext());
		System.out.println("Whileloop:"+ it.next());



	}

}
