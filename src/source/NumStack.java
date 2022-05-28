/**
 * This class is stored in the package source as it is the code required to run the program.
 */

package source;


/**
 * This class creates a NumStack and its functions.
 * @author Harveer Dole
 */
public class NumStack {
  Stack stack = new Stack();

  /**
   * method returns true if Stack is empty.
   * @return true or false depending on size of Stack.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  /**
   * method pushes float variable onto Stack.
   * @param floatVariable - float data you want to input in Stack.
   */
  public void push(float floatVariable) {
    stack.push(new Entry(floatVariable));
    
  }

  /**
   * method returns & removes float variable on top of Stack.
   * @return data on top of Stack.
   */
  public float pop() {
    return stack.pop().getValue();
  }
  
}
