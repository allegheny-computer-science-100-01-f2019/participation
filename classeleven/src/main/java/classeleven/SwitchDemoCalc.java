package classeleven;

/** A program that contain a method to
* calculate basic arithmetic expressions using switch operator.
*/
public class SwitchDemoCalc {
  private double result;

  public SwitchDemoCalc(double num) {
    result = num;
  }

  /** method to perform arithmetic calculations.
  */
  public double calculate(double left, double  right, char operator) {
    switch (operator) {
      case '+' : result = left + right;
        break;
      case '-' : result = left - right;
        break;
      case '*' : result = left * right;
        break;
      case '/' : result = left / right;
        break;
      case '%' : result = left % right;
        break;
      default  : System.out.println("Unknown Value");
    }
    return result;
  }
}
