package classnine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** Class to provide file reading functionality.
*/
public class CrimeFileReader {
  private static final String FILENAME = "input/SacramentocrimeJanuary2006.csv";
  private ArrayList<String> list;

  /** Constructor.
  */
  public CrimeFileReader() {
    list = new ArrayList<String>();
  }

  /** method to read a file.
  */
  public void readFile() throws IOException {

    Scanner fileScanner = new Scanner(new File(FILENAME));

    while (fileScanner.hasNext()) {
      String line = fileScanner.nextLine();
      //System.out.println(line);
      list.add(line);
    }
    System.out.println(list.get(1));
  }

  /** method to search and return
  * a list of items.
  */
  public ArrayList<String> find(String word) {
    Iterator<String> listIterator = list.iterator();
    ArrayList<String> searchList = new ArrayList<String>();
    while (listIterator.hasNext()) {
      String line = listIterator.next();
      if (line.toLowerCase().contains(word)) {
        searchList.add(line);
      }
    }
    return searchList;
  }

  /** get method to return the list results.
  */
  public ArrayList<String> getSearchList() {
    return list;
  }
}
