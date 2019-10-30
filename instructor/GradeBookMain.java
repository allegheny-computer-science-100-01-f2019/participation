package classseven;

import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class.
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a course name");
    String courseName = input.nextLine();

    // call the constructor
    GradeBook myGradeBook = new GradeBook(courseName);
    // call the displayMessage method
    myGradeBook.displayMessage(myGradeBook.getName());

    myGradeBook.setName("Comp. Exp");
    System.out.println("New course name " + myGradeBook.getName());

    System.out.println("Enter a course tag");
    String courseTag = input.nextLine();

    myGradeBook.setTag("CL");
    System.out.println("New course tag " + myGradeBook.getTag());

    // create another gradebook
    GradeBook myGradeBook1 = new GradeBook(courseName, courseTag);
    myGradeBook1.displayMessage(myGradeBook.getName());
  }
}
