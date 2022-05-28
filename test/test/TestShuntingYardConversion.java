/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import source.ShuntingYardConversion;

/**
 * This class tests the conversion of a infix notation to RPN. 
 * @author Harveer Dole
 */
class TestShuntingYardConversion {
  private ShuntingYardConversion convert;
  
  /**
   * to avoid repetition of code BeforeEach implemented to create a new
   * ShuntingYardConversion before each test.
   */
  
  @BeforeEach
  public void setup() {
    convert = new ShuntingYardConversion();
  }

  /**
   * test1. to pass test ShuntingYardConversion class created, getPrecedence method implemented
   * to return 1.
   */
  @Test
  void precedenceTestForPlusAndMinusTest() {
    assertEquals(1, convert.getPrecedence('+'));
    assertEquals(1, convert.getPrecedence('-'));
  }
  
  /**
   * test2. to pass test getPrecedence now returns 1 if the Character is a '+' or '-'
   * and 2 if it is a '*'.
   */
  @Test
  void precedenceTestForTimesTest() {
    assertEquals(2, convert.getPrecedence('*'));
  }
  
  /**
   * test3. to pass test getPrecedence now returns 2 if Character is '/' as well.
   */
  @Test
  void precedenceTestForDivideTest() {
    assertEquals(2, convert.getPrecedence('/'));
  }
  
  /**
   * test4.
   * to pass test postfix method added which returns 5.
   */
  @Test
  void singleNumberInputTest() {
    assertEquals("5", convert.postfix("5"));
  }
  
  /**
   * test5.
   * to pass test hashmap created where we assign '+' to plus symbol. A stack and a char array
   * are created(splits string up). Then we implement a for loop to read each token from array and
   * we change symbol depending on token. Then a if statement is implemented to push token on stack
   * if it is in the map, otherwise token is added onto output. A while loop is added to add onto
   * the output if stack isnt empty. Then at the end we return the output and add spaces in between.
   */
  @Test
  void addTwoNumbersTest() {
    assertEquals("5 4 +", convert.postfix("5 + 4"));
  }
  
  /**
   * test6.
   * to pass test hashmap operations have to be changed to String and we assign "-" to MinusSymbol.
   * Instead of char array we now need a arraylist of type String as using a char array for more
   * than 1 digit numbers wouldn't work. We now have a for loop where a String is read. Instead of
   * the spaces being added at the end we now add them in before pushing onto the stack and when
   * popping.
   */
  @Test
  void subtractTwoNumbersTest() {
    assertEquals("10 5 -", convert.postfix("10 - 5"));
  }
  
  /**
   * test7.
   * to pass test new hashmap operations added, "/" which assigns to divide symbol.
   */
  @Test
  void divideTwoNumbersTest() {
    assertEquals("100 10 /", convert.postfix("100 / 10"));
  }
  
  /**
   * test8.
   * to pass test new hashmap operation added, "*" which assigns to times symbol.
   */
  @Test
  void multiplyTwoNumbersTest() {
    assertEquals("50 2 *", convert.postfix("50 * 2"));
  }
  
  /**
   * test9.
   * to pass test we add two new else if statements. In the first one if the token is "(" we push
   * LeftBracket symbol onto stack. In the second one if the token is ")" we pop onto the output
   * (with a space) until we get a "(" on top of the stack, once we get this we just pop the 
   * bracket out of the stack.
   */
  @Test
  void addTwoNumbersWithBracketsTest() {
    assertEquals("15 2 +", convert.postfix("( 15 + 2 )"));
  }
  
  /**
   * test10.
   * to pass test we add a while loop in the if statement which checks if the map contains the 
   * token. The while loop checks the stack is not empty and if the precedence of the symbol on
   * top of the stack is greater or equal to the token precedence we add the symbol on top to the
   * output(with a space).
   */
  @Test
  void multiplyAndAddNumbersTest() {
    assertEquals("5 4 * 6 +", convert.postfix("5 * 4 + 6"));
  }
  
  
}
