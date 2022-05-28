/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import source.Plus;

/**
 * This class tests if two numbers are added together correctly.
 * @author Harveer Dole
 */
class TestPlus {

  /**
   * test1. to pass first assert command, Plus class created and eval method implemented to 
   * return 2. For second command eval method changed to now add a and b.
   */
  @Test
  void addTwoNumbers() {
    Plus plus = new Plus();
    assertEquals(2.0, plus.eval(1, 1));
    assertEquals(105.0, plus.eval(100, 5));
  }

}
