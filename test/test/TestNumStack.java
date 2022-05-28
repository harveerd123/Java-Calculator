/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import source.EmptyStackException;
import source.NumStack;

/**
 * This class tests functions of NumStack.
 * @author Harveer Dole
 */
class TestNumStack {

  /**
   * test1. first test passed by making NumStack class, isEmpty method added to return true. Second
   * test requires a Stack to be made in NumStack & push method to be added(calls upon push in 
   * Stack)& isEmpty to call upon isEmpty in Stack.
   */
  @Test
  void emptyStack() {
    NumStack stack = new NumStack();
    assertTrue(stack.isEmpty());
    
    stack.push(1f);
    assertFalse(stack.isEmpty());
  }

  /**
   * test2. first assert command requires pop method(which returns 10f) to be implemented. Second
   * command requires pop to now call upon pop from Stack & getValue method from Entry onto the 
   * stack made in NumStack.
   */
  @Test
  void popAndPushOnStack() {
    NumStack stack2 = new NumStack();
    stack2.push(10f);
    assertEquals(10f, stack2.pop(), 0);
    
    NumStack stack3 = new NumStack();
    stack3.push(20f);
    stack3.push(21f);
    assertEquals(21f, stack3.pop(), 0);
    stack3.pop();
    
    assertThrows(EmptyStackException.class, () -> {
      stack3.pop();
    });
  }
}
