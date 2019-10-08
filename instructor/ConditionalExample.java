package classfive;

import java.util.Scanner;

/** Class with if statement
* examples.
*/
public class ConditionalExample {
  /** Entrance to the main method.
  */
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an hour (24 hour)");
    int hour = scan.nextInt();
    if (hour < 12) {
      System.out.println("Good morning!");
    } else if (hour < 18) {
      System.out.println("Good day!");
    } else {
      System.out.println("Good evening!");
    }
  }
}
