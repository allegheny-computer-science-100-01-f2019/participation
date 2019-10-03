package classthree;

import java.util.Random;
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
    Random rand = new Random();
    int num1 = rand.nextInt(firstName.length()) + 2;
    System.out.println("num1 is " + num1);
    firstName = firstName.substring(0, num1);

    // TODO: explain
    int num2 = rand.nextInt(lastName.length());
    System.out.println("num2 is " + num2);
    char letter = lastName.charAt(num2);

    // TODO: explain
    char letter1 = "abcdef".charAt(rand.nextInt(6));
    System.out.println("letter 1 is " + letter1);
    lastName = lastName.replace(letter, letter1);

    System.out.println("Enter a job");
    String job = scanner.nextLine();
    job = job.toUpperCase();
    System.out.println("job is " + job);
    System.out.println("length of the job String: " + job.length());
    job = job.substring(0,2).concat("ER");

    System.out.println("*** Your new name is " + firstName + " " + lastName);
    System.out.println("Your new job title is " + job);
  }
}
