/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import source.InvalidException;
import source.StandardCalc;

/**
 * This class will check if the StandardCalc functions work as they should.
 * @author Harveer Dole
 *
 */
class TestStandardCalc {

  /**
   * test1.
   * to pass test StandardCalc class created with a evaluate method to return 63.
   */
  @Test
  void multipleOperationAndBracketsTest() {
    StandardCalc calc = new StandardCalc();
    assertEquals(63.0, calc.evaluate("( 5 * ( 6 + 7 ) ) - 2"));
  }
  
  /**
   * test2.
   * to pass test we create a RevPolishCalc calc and ShuntingYardConversion converter in the 
   * StandardCalc class, and then use evaluate method from RevPolishCalc passing in the conversion
   * done in ShuntingYardConversion(to RPN). 
   */
  @Test
  void anotherMultipleOperationAndBracketsTest() {
    StandardCalc calc2 = new StandardCalc();
    assertEquals(7.0, calc2.evaluate("( ( 5 + 2 ) / 2 ) * 2"));
  }
  
  /**
   * test3.
   * to pass test we implement a try catch statement around the return argument to catch the
   * NumberFormatException and throw InvalidException.
   */
  @Test
  void invalidExceptionTest() {
    StandardCalc calc3 = new StandardCalc();
    assertThrows(InvalidException.class, () -> {
      calc3.evaluate("( 5 + 2 ) +");
    });
  }
  

}
