/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class is created to make the Symbol types required and retrieve the characters associated
 * to each one.
 * @author Harveer Dole
 *
 */
public enum Symbol {
  LEFTBRACKET('('), RIGHTBRACKET(')'), TIMES('*'), DIVIDE('/'), PLUS('+'), MINUS('-'), 
  INVALID('I');
  
  char symbol;
  
  /**
   * This constructor passes parameter symbol and assigns the symbol.
   * @param symbol variable - character associated to Symbol name.
   */
  private Symbol(char symbol) {
    this.symbol = symbol;
  }
  
  /**
   * This method overrides the toString method to convert the symbol character to a string.
   */
  @Override
  public String toString() {
    return Character.toString(symbol);
  }
  
  /**
   * method returns symbol variable.
   * @return symbol variable associated to Symbol name.
   */
  public char getSymbol() {
    return symbol;
  }
}
