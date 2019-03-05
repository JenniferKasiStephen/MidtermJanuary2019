package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> names = new LinkedList<>();
		names.add("Ricky");
		names.add("Steffy");
		names.add("Hanny");
		names.add("Bunny");
		names.add("Ashish");
		names.add("Boon");
		names.add("Bless");
		names.add("Jessy");

		System.out.println("Peek:" + names.peek());
		System.out.println("Remove:" + names.remove());
		System.out.println("Poll:" +names.poll());

		for(String i : names)
		{
			System.out.println("ForLoop:" + i);
		}

		Iterator it = names.iterator();
		while(it.hasNext()) {
			System.out.println("WhileLoop:" + it.next());
		}






	}

}
