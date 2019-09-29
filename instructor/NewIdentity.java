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
    lastName = lastName.replace(letter, 't');

    System.out.println("Enter a job");
    String job = scanner.nextLine();
    job = job.toUpperCase();
    System.out.println("job is " + job);
    System.out.println("length of the job String: " + job.length());
    job = job.substring(0,2).concat("ing");

    System.out.println("Your new name is " + firstName + " " + lastName);
    System.out.println("Your new job title is " + job);
  }
}
