/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import source.Divide;
import source.DivideByZeroException;

/**
 * This class checks that division of two numbers occurs correctly.
 * @author Harveer Dole
 */
class TestDivide {

  /**
   * test1. first assert command passed by creating Divide class and eval method to return 10. 
   * Second command passed by changing eval method to return division of 2 numbers.
   */
  @Test
  void divideTwoNumbersTest() {
    Divide divide = new Divide();
    assertEquals(10.0, divide.eval(100, 10));
    assertEquals(5.0, divide.eval(10, 2));
  }
  
  /**
   * test2. to pass first command DivideByZeroException class created and we tell eval method 
   * in Divide to throw exception if either number is 0. For second command we insert a 
   * constructor in the exception class to throw a message.
   */
  @Test
  void divideByZero() {
    Divide divide2 = new Divide();
    assertThrows(DivideByZeroException.class, () -> {
      divide2.eval(10, 0);
    });
    
    try {
      divide2.eval(10, 0);
    }   catch (DivideByZeroException exception) {
      assertEquals("Cannot divide by zero", exception.getMessage());
    }
  }

}
