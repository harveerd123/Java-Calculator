/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import source.ArithmeticOverflowException;
import source.InvalidException;
import source.RevPolishCalc;

class TestRevPolishCalc {
  private RevPolishCalc calc;
  
  /**
   * to avoid repetition of code we implement BeforeEach to make a new RevPolishCalc 
   * before each test.
   */
  @BeforeEach
  public void setup() {
    calc = new RevPolishCalc();
  }

  /**
   * test1. to pass test RevPolishCalc class created & evaluate method returns 5.
   */
  @Test
  void singleNumberInputTest() {
    assertEquals(5.0, calc.evaluate("5.0"));
  }
  
  /**
   * test2. to pass test hashmap created with plus function, and String input is read. If input 
   * is number it is pushed onto stack, if not then state of Operator changes to the required one
   * and maths is done, once done value is pushed onto stack. evaluate method returns popped value. 
   */
  @Test
  void addTwoNumbersTest() {
    assertEquals(5.0, calc.evaluate("2.5 2.5 +"));
  }
  
  /**
   * test3. to pass test minus function added to hashmap, and in the else statement we now have
   * to create two new float variables which take values of the popped values from the stack
   * (this is because for minus when we retrieve the numbers from the stack we get the second
   * number first).
   */
  @Test
  void subtractTwoNumbersTest() {
    assertEquals(10.0, calc.evaluate("15 5 -"));
  }
  
  /**
   * test4. to pass test divide function added to hashmap.
   */
  @Test
  void divideTwoNumbersTest() {
    assertEquals(25.0, calc.evaluate("50 2 /"));
  }
  
  /**
   * test5. to pass test times function added to hashmap.
   */
  @Test
  void multiplyTwoNumbersTest() {
    assertEquals(100.0, calc.evaluate("50 2 *"));
  }
  
  /**
   * test6. to pass first assert command, InvalidException class created and in RevPolishCalc we
   * surround code with a try, catch statement to catch the exception. Second command passed by
   * creating constructor in InvalidException and passing message.
   */
  @Test
  void invalidInputTest() {
    assertThrows(InvalidException.class, () -> {
      calc.evaluate("2 + +");
    });
    
    try {
      calc.evaluate("2 + 2");
    }   catch (InvalidException exception) {
      assertEquals("Invalid input", exception.getMessage());
    }
  }
  
  /**
   * test7.
   */
  @Test
  void multipleNumbersTest() {
    assertEquals(63.0, calc.evaluate("5 6 7 + * 2 -"));
  }
  
  /**
   * test8.
   * to pass first command, ArithmeticOverflowException class created and in RevPolishCalc class
   * we now create a float value to obtain value of calculation and then check if it is too large
   * before returning. Second command requires ArithmeticOverflowException constructor to be made
   * so a message can be passed.
   */
  @Test
  void arithmeticExceptionTest() {
    assertThrows(ArithmeticOverflowException.class, () -> {
      calc.evaluate("3.4028235E38 1 +");
    });
    
    try {
      calc.evaluate("3.4028235E38 3 *");
    }   catch (ArithmeticOverflowException exception) {
      assertEquals("Values entered too large to calculate", exception.getMessage());
      
    }
  }
  
  /**
   * test9.
   * to pass first assert command, we must now catch NumberFormatException in our try catch block
   * as well to throw a InvalidException. For second assert command, we must implement the try
   * catch block on all the code instead of just the for loop.
   */
  @Test
  void anotherInvalidExceptionTest() {
    assertThrows(InvalidException.class, () -> {
      calc.evaluate("");
    });
    
    assertThrows(InvalidException.class, () -> {
      calc.evaluate(" ");
    });
  }

}
