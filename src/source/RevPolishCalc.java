/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * This class takes a String in RPN notation and evaluates it.
 * @author Harveer Dole
 */
public class RevPolishCalc implements Calculator {

  /**
   * method returns calculation of input.
   * @param input is the RPN notation.
   */
  public float evaluate(String input) throws InvalidException {
    NumStack stack = new NumStack();
    HashMap<String, OperatorState> map = new HashMap<>();
    map.put("+", new Plus());
    map.put("-", new Minus());
    map.put("/", new Divide());
    map.put("*", new Times());
    
    OperatorStateContext stateContext = new OperatorStateContext();
    
    List<String> inputtedData = Arrays.asList(input.split(" "));
    try {
      for (String current: inputtedData) {
        OperatorState operator = map.get(current);
        if (operator == null) {
          stack.push(Float.parseFloat(current));
        } else {
          stateContext.changeState(operator);
          float secondNumber = stack.pop();
          float firstNumber = stack.pop();
          stack.push(stateContext.eval(firstNumber, secondNumber));
        }
      
      }
      float value = stack.pop();
      if (value >= Float.MAX_VALUE) { 
        throw new ArithmeticOverflowException();
      }
      return value;
    }   catch (EmptyStackException | NumberFormatException exception) {
      throw new InvalidException();
    }
  }

}
