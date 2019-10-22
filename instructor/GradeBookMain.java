package classseven;

import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class.
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main(String [] args) {
    // call the constructor
    GradeBook myGradeBook = new GradeBook();
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a course name");
    String courseName = input.nextLine();

    // call the displayMessage method
    myGradeBook.displayMessage(courseName);
  }
}
