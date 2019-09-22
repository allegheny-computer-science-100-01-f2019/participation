package classtwo;

import java.util.Scanner;

/** Program to calculate various
* conversions.
* @author Janyl Jumadinova
*
*/

public class Conversion {
  /** Main method that creates the needed
  * variables and has expressions to perform
  * the neccessary calculations.
  */
  public static void main(String [] args) {

    // 1 Set up scanner (declare and initialize)
    Scanner input = new Scanner(System.in);

    // 2.1 Ask the user for input
    // 2.2 Declare and initialize variables with user's input
    System.out.println("Enter your name");
    String name = input.nextLine();
    System.out.println("Enter a temperature in Celcius (integer)");
    int tempC = input.nextInt();

    // 3. Calculate the conversion
    double tempF = tempC * 1.8 + 32;

    // 4. Output the result
    System.out.println("Hello, " + name);
    System.out.println("Converting " + tempC + " from Celcius to Fahrenheit gives "
                  + tempF);
  }
}
