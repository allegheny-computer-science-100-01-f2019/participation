package classeight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** Class with ArrayList statement
* examples.
*/
public class ArrayListExample {
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
    // create an ArrayList
    ArrayList<String> list = new ArrayList<String>();
    while (scanner.hasNext()) {
      String line = scanner.next();
      if (count % 2 == 0) {
        list.add(line);
      }
      count++;
    }
    System.out.println(list);
  }
}
