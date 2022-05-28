/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class creates a custom exception to be thrown when we divide numbers by zero.
 * @author Harveer Dole
 */
@SuppressWarnings("serial")
public class DivideByZeroException extends RuntimeException {
  /**
   * This constructor passes a message to be thrown when the exception occurs.
   */
  public DivideByZeroException() {
    super("Cannot divide by zero");
  }

}
