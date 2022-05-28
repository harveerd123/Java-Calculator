/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class calculates the infix notation.
 * @author Harveer Dole
 */
public class StandardCalc implements Calculator {

  /**
   * method returns calculation of input.
   * @param input is infix notation.
   */
  public float evaluate(String input) throws InvalidException {
    RevPolishCalc calc = new RevPolishCalc();
    ShuntingYardConversion convert = new ShuntingYardConversion();
    
    try {
      return calc.evaluate(convert.postfix(input));
    }   catch (NumberFormatException exception) {
      throw new InvalidException();
    }
  }

}
