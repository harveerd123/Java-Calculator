/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This interface links the types of calculators together.
 * @author Harveer Dole
 */
public interface Calculator {
  public float evaluate(String input) throws InvalidException;

}
