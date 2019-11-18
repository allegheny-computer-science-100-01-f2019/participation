package classnine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class manages an analyzer program for a crime data.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */
public class CrimeMain {

  /**
   * This is the main method that provides the user interface and calls all of
   * the necessary methods.
   *
   */
  public static void main(String[] args) throws IOException {

    System.out.println("Welcome to the Crime Data Manager.");
    System.out.println("What operation would you like to perform?");
    System.out.println("Available options: "
        + "read, analyze, quit."
        + "You must first read, then you can analyze.");

    Scanner userScanner = new Scanner(System.in);

    CrimeFileReader reader = new CrimeFileReader();
    CrimeAnalyzer analyzer = new CrimeAnalyzer();

    while (userScanner.hasNext()) {
      String command = userScanner.next();
      if (command.equals("read")) {
        reader.readFile();
      } else if (command.equals("analyze")) {
        System.out.println("What crime would you like to search for?");
        String searchWord = userScanner.next();
        ArrayList<String> searchList = reader.find(searchWord);
        analyzer.findDistricts(searchList);
        System.out.println(searchWord + " occurred " + analyzer.getCount() + " times");
        System.out.println(searchWord + " occurred in " + analyzer.getDistricts().size()
                          + " districts, including: \n" + analyzer.getDistricts());
        System.out.println("The following crimes occurred in these districts");
        analyzer.outputCrime(searchList);
        System.out.println(analyzer.getCrimeDescriptions());
      } else if (command.equals("quit")) {
        System.out.println("Thank you for using the Crime Data Manager.");
        break;
      }
    }
  }
}
