/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class creates a custom exception to be thrown when a Invalid input is put in.
 * @author Harveer Dole
 */
@SuppressWarnings("serial")
public class InvalidException extends RuntimeException {
  /**
   * This constructor passes a message to be shown when the exception occurs.
   */
  public InvalidException() {
    super("Invalid input");
  }

}
