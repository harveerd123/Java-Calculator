/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import source.Minus;
import source.OperatorStateContext;

/**
 * This class tests for the states to do what is required, and also change when required.
 * @author Harveer Dole
 */
class TestOperatorStateContext {
  
  /**
   * test1. to pass first assert command OperatorStateContext class created, and eval method
   * added to return 20.
   */
  @Test
  void addTwoNumbers() {
    OperatorStateContext stateContext = new OperatorStateContext();
    assertEquals(20.0, stateContext.eval(10, 10));
  }
  
  /**
   * test2. to pass we implement a currentState variable in the class, and implement a changeState
   * method to change the Operator state. The eval method then calls upon this Operators eval
   * method. A constructor is also added to have the state set to Addition when first called upon.
   */
  @Test
  void minusTwoNumbers() {
    OperatorStateContext stateContext2 = new OperatorStateContext();
    stateContext2.changeState(new Minus());
    assertEquals(10.0, stateContext2.eval(15, 5));
  }

}
