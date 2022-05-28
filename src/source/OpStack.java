/**
 * This class is stored in the source package as it is the code required to run the program.
 */

package source;

/**
 * This class creates a OpStack and its functions.
 * @author Harveer Dole
 */
public class OpStack {
  Stack stack = new Stack();
  
  /**
   * method returns true if Stack is empty.
   * @return true or false depending on size of Stack.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  /**
   * method pushes symbol variable onto Stack.
   * @param symbol - Symbol data you want to add onto Stack.
   */
  public void push(Symbol symbol) {
    stack.push(new Entry(symbol));
  }

  /**
   * method returns & removes symbol variable on top of Stack.
   * @return data on top of Stack.
   */
  public char pop() {
    return stack.pop().getSymbol();
  }

  /**
   * method obtains symbol variable on top of Stack.
   * @return data on top of Stack.
   */
  public char top() {
    return stack.top().getSymbol();
  }

}
