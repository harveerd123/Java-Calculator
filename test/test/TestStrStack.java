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
import source.StrStack;

/**
 * This class tests functions of StrStack.
 * @author Harveer Dole
 */
class TestStrStack {

  /**
   * test1.
   * first assert command passed by making StrStack class & isEmpty added to return true. Second 
   * command passed by making a Stack in StrStack & push method added(calls upon push in Stack) &
   * isEmpty to call upon isEmpty in Stack.
   */
  @Test
  void emptyStack() {
    StrStack stack = new StrStack();
    assertTrue(stack.isEmpty());
    
    stack.push("5 + 5");
    assertFalse(stack.isEmpty());
  }
  
  /**
   * test2.
   * first assert command passed by adding pop method which returns "10 / 2". Second assert 
   * command requires pop to now call upon pop from Stack and getValue from Entry class onto the 
   * stack made in StrStack.
   */
  @Test
  void popAndPushOnStack() {
    StrStack stack2 = new StrStack();
    stack2.push("10 / 2");
    assertEquals("10 / 2", stack2.pop());
    
    StrStack stack3 = new StrStack();
    stack3.push("2 * 2");
    stack3.push("1 + 1");
    assertEquals("1 + 1", stack3.pop());
    stack3.pop();
    
    assertThrows(EmptyStackException.class, () -> {
      stack3.pop();
    });
  }
}
