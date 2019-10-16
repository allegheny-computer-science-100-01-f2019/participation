package classsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Class with if statement
* examples.
*/
public class SearchText {
  /** Entrance to the main method.
  */
  public static void main(String [] args) {
    // declare the starting file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputFile = new File("input/input_file.txt");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the input file");
    }

    int count = 0;
    while (scanner.hasNext()) {
      String word = scanner.next();
      if (word.equals("woman") || word.equals("women")) {
        count++;
      }
    }
    System.out.println("Woma(e)n appeared " + count + " number of times");
  }
}
