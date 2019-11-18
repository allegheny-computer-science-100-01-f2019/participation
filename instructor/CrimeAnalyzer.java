package classnine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** CrimeAnalyzer class to allow search functionality.
*/
public class CrimeAnalyzer {
  private ArrayList<String> districtList;
  private ArrayList<String> crimeList;
  private int count;

  /** constructor.
  */
  public CrimeAnalyzer() {
    districtList = new ArrayList<String>();
    crimeList = new ArrayList<String>();
    count = 0;
  }

  /** method to output data for specific districts.
  */
  public void findDistricts(ArrayList<String> list) {
    count = list.size();

    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      String line = (String) iterator.next();
      Scanner lineScanner = new Scanner(line);
      lineScanner.useDelimiter(",");
      String district;
      lineScanner.next();
      lineScanner.next();
      district = lineScanner.next();
      if (!districtList.contains(district)) {
        districtList.add(district);
      }
    }
  }

  /** method to output crime information for specific district.
  */
  public void outputCrime(ArrayList<String> list) {
    count = list.size();
    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      String line = (String) iterator.next();
      Scanner lineScanner = new Scanner(line);
      lineScanner.useDelimiter(",");
      lineScanner.next();
      lineScanner.next();
      String district = lineScanner.next();
      lineScanner.next();
      lineScanner.next();
      String crimeDescription = lineScanner.next();
      if (!crimeList.contains(crimeDescription) && districtList.contains(district)) {
        crimeList.add(crimeDescription);
      }
    }
  }

  /** get method to return count.
  */
  public int getCount() {
    return count;
  }

  /** get method to return the list of districts.
  */
  public ArrayList<String> getDistricts() {
    return districtList;
  }

  /** get method to return the list of crimes.
  */
  public ArrayList<String> getCrimeDescriptions() {
    return crimeList;
  }
}
