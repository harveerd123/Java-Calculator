/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates a Stack and its functions.
 * @author Harveer Dole
 */
public class Stack {
  int size;
  List<Entry> entryList = new ArrayList<>();
  
  /**
   * method returns true if size == 0.
   * @return true/false depending on size.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * method increments size by 1 and pushes(adds) entry onto list.
   * @param entry variable added onto stack.
   */
  public void push(Entry entry) {
    entryList.add(entry);
    size += 1;
  }
  
  /**
   * method decrements size by 1 and returns entry from list.
   * @return popped entry from stack.
   * @throws EmptyStackException if size == 0.
   */
  public Entry pop() throws EmptyStackException {
    if (size == 0) {
      throw new EmptyStackException();
    }
    size -= 1;
    return entryList.remove(size);
  }

  /**
   * method returns the size of Stack.
   * @return size variable.
   */
  public int getSize() {
    return size;
  }

  /**
   * method returns entry on top of Stack and throws exception.
   * @return entry on top of stack.
   * @throws EmptyStackException when top == 0.
   */
  public Entry top() throws EmptyStackException {
    int top = size;
    if (top == 0) {
      throw new EmptyStackException();
    }
    return entryList.get(--top);
  }

  
}
