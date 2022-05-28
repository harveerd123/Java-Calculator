/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import source.Symbol;

/**
 * This class will check that the correct Symbol types exist and have the correct character 
 * associated to each type.
 * @author Harveer Dole
 */
class TestSymbol {

  /**
   * test1.  
   * To pass test, enum class created with all symbol names linked to character values and symbol
   * variable made. Constructor made to assign symbol variable. toString returns symbol(variable)
   * as String.
   */
  @Test
  void symbolCheck() {
    Symbol[] symbols = {Symbol.LEFTBRACKET, Symbol.RIGHTBRACKET, Symbol.TIMES, Symbol.DIVIDE,
        Symbol.PLUS, Symbol.MINUS, Symbol.INVALID};
    
    String[] characters = {"(", ")", "*", "/", "+", "-","I"};
    
    for (int i = 0; i < symbols.length; i++) {
      assertEquals(symbols[i].toString(), characters[i]);
    }
  }
  
}
