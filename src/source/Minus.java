/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class subtracts two numbers.
 * @author Harveer Dole
 */
public class Minus implements OperatorState {

  /**
   * method returns value obtained by subtracting two numbers.
   */
  @Override
  public float eval(float a, float b) {
    return a - b;
  }

}
