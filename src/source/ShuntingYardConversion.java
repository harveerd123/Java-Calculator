/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * This class converts the infix notation to RPN notation.
 * @author Harveer Dole
 */
public class ShuntingYardConversion {

  /**
   * method returns integer depending on operation.
   * @param op is the operation.
   * @return integer 
   */
  public int getPrecedence(char op) {
    if (op == '+' || op == '-') {
      return 1;
    }   else if (op == '*' || op == '/') {
      return 2;
    }
    return 0;
  }

  /**
   * method converts infix to postfix.
   * @param infix notation
   * @return postfix notation.
   */
  public String postfix(String infix) {
    HashMap<String, Symbol> map = new HashMap<>();
    map.put("+", Symbol.PLUS);
    map.put("-", Symbol.MINUS);
    map.put("/", Symbol.DIVIDE);
    map.put("*", Symbol.TIMES);
    String output = "";
    OpStack stack = new OpStack();
    
    List<String> list = Arrays.asList(infix.split(" "));
    
    for (String token: list) {
      Symbol state = map.get(token);
      if (map.containsKey(token)) {
        output += " ";
        while (!stack.isEmpty() && getPrecedence(stack.top()) >= getPrecedence(token.charAt(0))) {
          output += stack.pop() + " ";
        }
        stack.push(state);
        
      } else if (token.equals("(")) {
        stack.push(Symbol.LEFTBRACKET);
      } else if (token.equals(")")) {
        while (!(stack.top() == Symbol.LEFTBRACKET.getSymbol())) {
          output += " " + stack.pop();
        }
        stack.pop();
      } else {
        output += token;
      }
    }
    while (!stack.isEmpty()) {
      output += " " + stack.pop();
    }
    return output;
  }
  
}
