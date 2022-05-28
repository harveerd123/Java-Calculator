/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class adds two values up.
 * @author Harveer
 *
 */
public class Plus implements OperatorState {

  /**
   * method returns addition of a and b.
   */
  @Override
  public float eval(float a, float b) {
    return a + b;
  }
  
}
