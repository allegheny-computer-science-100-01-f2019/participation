package classfour;

import java.util.Scanner;

/** Amortization problem.
*/
public class Payments {
  /** Calculate the loan payment amount based
  * on inputted parameters.
  */
  public static void main(String [] args) {
    // create an instance of the Scanner
    Scanner scan = new Scanner(System.in);

    // declare variables
    double rate;
    double payment;

    System.out.println("Enter an interest rate: ");
    rate = scan.nextDouble();
    System.out.println("Enter a loan amount: ");
    double loan = scan.nextDouble();
    System.out.println("Enter a loan term: ");
    double term = scan.nextDouble();

    double powFunc = Math.pow(1 + rate, term);
    double amount = loan * rate * powerFunc / ( powFunc - 1);
    System.out.println("Loan payment amount " + amount);
  }
}
