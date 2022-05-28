/**
 * This class is stored in package test as it is a JUnit test case.
 */

package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import source.Type;

/**
 * This class is created to check that all the correct Types are created.
 * @author Harveer Dole
 */
class TestType {

  /**
   * test1.
   * To pass test enum class created with the different Types there should be.
   */
  @Test
  void typeCheck() {
    Type[] types = {Type.NUMBER, Type.SYMBOL, Type.STRING, Type.INVALID};
    
    String[] expectedType = {"NUMBER", "SYMBOL", "STRING", "INVALID"};
    
    for (int i = 0; i < types.length; i++) {
      assertEquals(types[i].toString(), expectedType[i]);
    }
  }
}
