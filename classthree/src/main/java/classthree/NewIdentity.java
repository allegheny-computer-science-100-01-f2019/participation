package classthree;

import java.util.Scanner;

/** This program helps the user to create
* a new identity.
* run: gradle -q --console plain run
* @author: Janyl Jumadinova
*/
public class NewIdentity {
  /** The main method uses String class's methods
  * to modify user's input and produce new output.
  */
  public static void main(String [] args) {
    // create an instance of the Scanner
    Scanner scanner = new Scanner(System.in);

    // get the user's input
    System.out.println("Please enter a first name: ");
    String firstName = scanner.nextLine();
    System.out.println("Please enter a last name: ");
    String lastName = scanner.nextLine();

    // TODO: explain
    firstName = firstName.substring(0, 4);

    // TODO: explain
    char letter = lastName.charAt(2);

    // TODO: explain
    lastName = lastName.replace(letter, 'r');

    System.out.println("Your new name is " + firstName + " " + lastName);
  }
}
