/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class creates a custom exception to be thrown in entry class.
 * @author Harveer Dole
 */
@SuppressWarnings("serial")
public class BadTypeException extends RuntimeException {
  /**
   * This constructor passes a message to be thrown when exception occurs.
   */
  public BadTypeException() {
    super("Something has gone wrong");
  }

}
