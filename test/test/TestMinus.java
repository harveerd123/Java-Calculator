/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import source.Minus;

/**
 * This class tests that subtraction of two numbers occurs correctly.
 * @author Harveer
 *
 */
class TestMinus {

  /**
   * test1. to pass first assert command Minus class created with eval method to return 5. 
   * Second command passed by changing eval method to now return subtraction of 2 numbers.
   */
  @Test
  void subtractTwoNumbersTest() {
    Minus minus = new Minus();
    assertEquals(5.0, minus.eval(6, 1));
    assertEquals(12.0, minus.eval(18, 6));
  }

}
