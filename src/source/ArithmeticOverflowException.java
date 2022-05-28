/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class creates a custom exception to be thrown when the values are too large.
 * @author Harveer Dole
 */
@SuppressWarnings("serial")
public class ArithmeticOverflowException extends RuntimeException {
  /**
   * This constructor passes a message to be shown when the exception occurs.
   */
  public ArithmeticOverflowException() {
    super("Values entered too large to calculate");
  }

}
