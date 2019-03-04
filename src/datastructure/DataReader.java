package datastructure;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(textFile));
		} catch (IOException e) {
			e.printStackTrace();

			String st ;

			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}

			Stack<String> map = new Stack<String>();
			String[] splitWords = textFile.split("");

			    for (String word : splitWords) {
				Integer count = map.indexOf(splitWords);

				if (count == null) {

					count = 0;
				}
				map.add(word);
			}
			    map.push(textFile);

			    System.out.println(map);


		}
	}
}
