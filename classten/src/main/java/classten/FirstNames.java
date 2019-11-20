package classten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Class to search and manipulate the input text file.
*/
public class FirstNames {
<<<<<<< HEAD
	public static void main(String args[]) throws IOException {

		String [] names = new String[41];

		File file = new File("input/names.txt");
		Scanner input = new Scanner(file);
=======
  /** main method demonstrates the use of an array.
  */
  public static void main(String [] args) throws IOException {
>>>>>>> 9c5a7b4e203b59fad51684dd1a4810b3a2eb0305

    File file = new File("input/names.txt");
    Scanner input = new Scanner(file);
  }
}
