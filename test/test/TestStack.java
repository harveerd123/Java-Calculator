/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import source.EmptyStackException;
import source.Entry;
import source.Stack;
import source.Symbol;

/**
 * This class will check if Stack is correctly implemented with all it functions.
 * @author Harveer Dole
 *
 */
class TestStack {
  private Stack stack;
  /**
   * to avoid repetition of code BeforeEach implemented to make new stack before each test.
   */
  
  @BeforeEach
  public void setup() {
    stack = new Stack();
  }
  
  /**
   * test1.
   * to pass test Stack class created and isEmpty method returns true.
   */
  @Test
  void emptyStackTest() {
    assertTrue(stack.isEmpty());
  }
  
  /**
   * test2. 
   * to pass test int size variable created, and isEmpty now returns true if size == 0. The push
   * method increments the size by 1.
   */
  @Test
  void pushMethod() {
    stack.push(new Entry(5f));
    assertFalse(stack.isEmpty());
  }
  
  /**
   * test3.
   * to pass test pop method implemented to decrement size by one.
   */
  @Test
  void popMethod() {
    stack.push(new Entry("3 + 5"));
    stack.pop();
    assertTrue(stack.isEmpty());
  }
  
  /**
   * test4. 
   * to pass test pop method now returns a new entry(4f).
   */
  @Test
  void popMethodAndReturnEntry() {
    stack.push(new Entry(4f));
    Entry popped = stack.pop();
    assertEquals(4f, popped.getValue(), 0);
  }
  
  /**
   * test5.
   * to pass test EmptyStackException class is created which passes a message via its constructor
   * and pop method now throws this custom exception when size == 0.
   * 
   */
  @Test
  void popOnEmptyStack() {
    assertThrows(EmptyStackException.class, () -> {
      stack.pop();
    });
    
    try {
      stack.pop();
    }   catch (EmptyStackException exception) {
      assertEquals("Something has gone wrong", exception.getMessage());
    }
  }
  
  /**
   * test6.
   * to pass test getSize method implemented to return 2 for first assert command. Then getSize 
   * has to be improved and so it now returns the size variable.
   */
  @Test
  void checkSize() {
    stack.push(new Entry(21f));
    stack.push(new Entry(22f));
    assertEquals(2, stack.getSize());
    
    stack.pop();
    assertEquals(1, stack.getSize());
  }
  
  /**
   * test7.
   * to pass test push and pop methods both need improvement. Firstly arraylist is added to Stack
   * class, then entries added onto this list in push method(add command) & they are removed
   * (remove command) and returned in pop method.
   */
  @Test
  void pushAndPopMultipleEntries() {
    stack.push(new Entry(50f));
    stack.push(new Entry(100f));
    Entry poppedFirst = stack.pop();
    assertEquals(100f, poppedFirst.getValue(), 0);
    
    Entry poppedSecond = stack.pop();
    assertEquals(50f, poppedSecond.getValue(), 0);
  }

  /**
   * test8. 
   * to pass first assert command top method returns MINUS entry. Then top method will return
   * entry from arraylist using get command. New int top variable assigned inside top method
   * (top = size), & decremented by 1 to return entry. The int top is created as using size can
   * affect its value and cause errors.
   */
  @Test
  void topMethod() {
    stack.push(new Entry(Symbol.PLUS));
    stack.push(new Entry(Symbol.MINUS));
    Entry top = stack.top();
    assertEquals('-', top.getSymbol());
    
    stack.pop();
    Entry top2 = stack.top();
    assertEquals('+', top2.getSymbol());
  }

  /**
   * test9.
   * to pass test top method now throws exception when the top variable == 0.
   */
  @Test
  void topOnEmptyStack() {
    assertThrows(EmptyStackException.class, () -> {
      stack.top();
    });
  }
  
  /**
   * test10.
   */
  @Test
  void functionCheck() {
    stack.push(new Entry(100f));
    stack.push(new Entry(103.5f));
    stack.push(new Entry(Symbol.DIVIDE));
    stack.push(new Entry("3 * 2"));
    
    Entry poppedNumber1 = stack.pop();
    assertEquals("3 * 2", poppedNumber1.getString());
    Entry topNumber1 = stack.top();
    assertEquals('/', topNumber1.getSymbol());
    
    assertEquals(3, stack.getSize());
   
    stack.pop();
    stack.pop();
    Entry topNumber2 = stack.top();
    assertEquals(100f, topNumber2.getValue(), 0);
    stack.pop();
  }
}
