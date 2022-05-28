/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class implements the required Calculator and returns the calculation.
 * @author Harveer Dole
 */
public class CalcModel {
  Calculator standardCalc = new StandardCalc();
  Calculator revPolishCalc = new RevPolishCalc();
  Calculator calc;
  
  /**
   * method returns sum of expression.
   * @param expr which is evaluated.
   * @param infix is true if expr in infix format.
   * @return float variable which is sum of expression.
   */
  public float evaluate(String expr, boolean infix) {
    if (infix) {
      calc = standardCalc;
    }   else {
      calc = revPolishCalc;
    }
    return calc.evaluate(expr);
  }

}
