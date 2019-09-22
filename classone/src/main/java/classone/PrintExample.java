package classone;

import java.util.Scanner;

/** PrintExample program in Java.
* This program shows examples of String
* concatenation and escape sequence usage.
* @author Janyl Jumadinova
*/

public class PrintExample {

  /** main method containing print statements
  * to demonstrate String printing and String
  * concatenation.
  */
  public static void main(String [] args) {
    System.out.println("Hello World!");
    System.out.print("Hi\t");
    System.out.print("there! \n");

    // concatenation example
    System.out.println("Adding " + 12 + " " + 23);
    System.out.println("Adding " + (12 + 23));

    // Age conversion
    // ask the user for input
    System.out.println("Enter an age");

    // variable declaration
    Scanner input = new Scanner(System.in);

    int age;
    age = input.nextInt();
    System.out.println("Age is " + age);
    int ageMonths = 0;
    ageMonths = age * 12;
    System.out.println("Age in months " + ageMonths);
  }
}
