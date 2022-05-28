/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class creates a custom exception to be thrown in stack class.
 * @author Harveer Dole
 */

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
 
  /**
   * This constructor method passes a message to be shown when exception occurs.
   */
  public EmptyStackException() {
    super("Something has gone wrong");
  }

}
