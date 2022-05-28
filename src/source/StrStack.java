/**
 *This class is stored in the source package as it is the code required to run the program. 
 */

package source;

/**
 * This class creates a StrStack and its functions.
 * @author Harveer Dole
 */
public class StrStack {
  Stack stack = new Stack();
  
  /**
   * method returns true if Stack is empty.
   * @return true or false depending on size of Stack.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  
  /**
   * method pushes string variable onto Stack.
   * @param string - String data you want to input in Stack.
   */
  public void push(String string) {
    stack.push(new Entry(string));
  }

  /**
   * method returns & removes String variable on top of stack.
   * @return data on top of Stack.
   */
  public String pop() {
    return stack.pop().getString();
  }

}
