/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class allows for the operation state to be changed.
 * @author Harveer Dole
 */
public class OperatorStateContext {
  private OperatorState currentState;
  
  /**
   * This constructor sets the currentState to the Plus operation.
   */
  public OperatorStateContext() {
    currentState = new Plus();
  }
  
  /**
   * method returns the states eval method.
   * @param a inputted into method.
   * @param b inputted into method.
   * @return calculation of two numbers depending on state.
   */
  public float eval(float a, float b) {
    return this.currentState.eval(a, b);
  }

  /**
   * method changes state to a different one.
   * @param newState becomes the currentState.
   */
  public void changeState(OperatorState newState) {
    this.currentState = newState;
    
  }

}
