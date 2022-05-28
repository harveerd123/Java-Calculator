/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import source.CalcModel;

/**
 * This class will check if we can call upon the correct calculators and get the correct
 * answer.
 * @author Harveer Dole
 */
class TestCalcModel {

  /**
   * test1. to pass test CalcModel class made, evaluate method made to return 63.
   */
  @Test
  void infixNotationTest() {
    CalcModel calc = new CalcModel();
    assertEquals(63.0, calc.evaluate("( 5 * ( 6 + 7 ) ) - 2", true));
  }
  
  /**
   * test2. to pass test we make a standard & RPN calculator, inside the evaluate method we 
   * call upon the standard one if infix is true and RPN otherwise. Then at the end we call upon 
   * the calculators evaluate method to get the answer.
   */
  @Test
  void postfixNotationTest() {
    CalcModel calc2 = new CalcModel();
    assertEquals(35.0, calc2.evaluate("15 20 +", false));
  }

}
