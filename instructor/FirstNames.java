package classten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Class to search and manipulate the input text file.
*/
public class FirstNames {
/** it is the main method for this class.
*/
	public static void main(String args[]) throws IOException {

		File file = new File("input/names.txt");
		Scanner input = new Scanner(file);

		String [] names = new String[32];

		// read and populate the array
		int count = 0;
		while(input.hasNext()) {
			names[count] = input.next();
			count++;
		}
		Arrays.sort(names);

		// iterate through the array
		for(int index = 0; index < names.length; index++) {
			if (names[index].startsWith("K")) {
				System.out.println(names[index]);
			}
		}
	}
}
