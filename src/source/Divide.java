/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class divides two numbers.
 * @author Harveer Dole
 *
 */
public class Divide implements OperatorState {

  /**
   * method returns value obtained by dividing two numbers.
   */
  @Override
  public float eval(float a, float b) throws DivideByZeroException {
    if (a == 0 || b == 0) {
      throw new DivideByZeroException();
    }
    return a / b;
  }

}
