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
import source.OpStack;
import source.Symbol;

/**
 * This class will test the functions of OpStack.
 * @author Harveer Dole
 */
class TestOpStack {

  /**
   * test1. to pass first assert command, OpStack class created and isEmpty method added to
   * return true. For the second command a Stack has to be created in OpStack and push method
   * (which calls upon push in Stack) added to OpStack & isEmpty now calls upon isEmpty from Stack.
   */
  @Test
  void emptyStack() {
    OpStack stack = new OpStack();
    assertTrue(stack.isEmpty());
    
    stack.push(Symbol.PLUS);
    assertFalse(stack.isEmpty());
  }
  
  /**
   * test2. first assert command required pop method(which returns '+') to be added to OpStack.
   * Second command required pop to call upon pop from Stack & getSymbol from Entry onto stack
   * made in OpStack.
   */
  @Test
  void popAndPushOnStack() {
    OpStack stack2 = new OpStack();
    stack2.push(Symbol.PLUS);
    assertEquals('+', stack2.pop());
    
    OpStack stack3 = new OpStack();
    stack3.push(Symbol.DIVIDE);
    stack3.push(Symbol.LEFTBRACKET);
    assertEquals('(', stack3.pop());
    stack3.pop();
    
    assertThrows(EmptyStackException.class, () -> {
      stack3.pop();
    });
  }
  
  /**
   * test3. to pass test we called upon top method in the Stack class.
   */
  @Test
  void topTest() {
    OpStack stack4 = new OpStack();
    stack4.push(Symbol.PLUS);
    stack4.push(Symbol.MINUS);
    assertEquals('-', stack4.top());
  }
}
