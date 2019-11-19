package classten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Class to search and manipulate the input text file.
*/
public class FirstNames {
  /** main method demonstrates the use of an array.
  */
  public static void main(String [] args) throws IOException {

    File file = new File("input/names.txt");
    Scanner input = new Scanner(file);
  }
}
