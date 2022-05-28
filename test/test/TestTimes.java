/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import source.Times;

/**
 * This class tests for the multiplication of numbers.
 * @author Harveer Dole
 */
class TestTimes {
  
  /**
   * test1.
   * to pass first assert command Times class created, eval method added to return 1. Second 
   * command passed by changing eval method to return multiplication of 2 numbers.
   */
  @Test
  void multiplyTwoNumbers() {
    Times times = new Times();
    assertEquals(1.0, times.eval(1,1));
    assertEquals(50.0, times.eval(25, 2));
  }

}
