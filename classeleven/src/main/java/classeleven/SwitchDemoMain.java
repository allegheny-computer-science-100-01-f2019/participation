package classeleven;

import java.text.DecimalFormat;
import java.util.Scanner;

/** A program that calculates basic arithmetic
* expressions using switch operator.
**/
public class SwitchDemoMain {

  /** main method to get user's input and
  * call method for calculations.
  */
  public static void main(String[] args) {
    // to get command line arguments run the program with:
    // gradle run --args 'test1 test2',
    // where 'test1' and 'test2' are saved into args array
    System.out.println(args[0] + "," + args[1]);
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a simple expression: ");
    double left;
    double right;
    char operator;
    left = input.nextDouble(); // requires spaces between double values and char operator!
    operator = input.next().charAt(0);
    right = input.nextDouble();
    System.out.print(left + " " + operator + " " + right + " = ");

    SwitchDemoCalc calc = new SwitchDemoCalc(0);

    double result = calc.calculate(left, right, operator);

    DecimalFormat fmt = new DecimalFormat("0.##");

    System.out.println(fmt.format(result));

  }
}
