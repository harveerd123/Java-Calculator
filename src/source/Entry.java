/**
 * This class is stored in the package source as it is code required to run program.
 */

package source;

/**
 * This class is created to make entries of different types and obtain the data stored in the
 * entries.
 * @author Harveer Dole
 */

public class Entry {
  float number;
  String string;
  Symbol symbol;
  Type type;
  
  /**
   * constructor passes number variable and assigns to number. Also assigns the type variable
   * to NUMBER.
   * @param number variable - float data you want to input in entry.
   */
  public Entry(float number) {
    this.number = number;
    this.type = Type.NUMBER;
  }

  /**
   * constructor passes String variable and assigns to string. Also assigns the type variable
   * to STRING.
   * @param string variable - String data you want to input in entry.
   */
  public Entry(String string) {
    this.string = string;
    this.type = Type.STRING;
  }

  /**
   * constructor passes Symbol variable and assigns to symbol. Also assigns the type variable to
   * SYMBOL.
   * @param symbol variable - Symbol data you want to input in entry.
   */
  public Entry(Symbol symbol) {
    this.symbol = symbol;
    this.type = Type.SYMBOL;
  }

  /**
   * method returns float variable in entry and throws exception.
   * @return float variable in entry.
   * @throws BadTypeException if the method is called upon and it is not of type NUMBER.
   */
  public float getValue() throws BadTypeException {
    if (getType() != Type.NUMBER) {
      throw new BadTypeException();
    }
    return number;
  }

  /**
   * method returns String variable in entry and throws exception.
   * @return string variable in entry.
   * @throws BadTypeException if method called upon and it is not of type STRING.
   */
  public String getString() throws BadTypeException {
    if (getType() != Type.STRING) {
      throw new BadTypeException();
    }
    return string;
  }
  
  /**
   * method returns Symbol character associated with Symbol name by calling upon getSymbol method
   * from Symbol class and throws an exception.
   * @return symbol character variable in entry.
   * @throws BadTypeException if method called upon and not of type SYMBOL.
   */
  public char getSymbol() throws BadTypeException {
    if (getType() != Type.SYMBOL) {
      throw new BadTypeException();
    }
    return symbol.getSymbol();
  }
  
  /**
   * method returns the Type of entry.
   * @return type variable of entry.
   */
  public Type getType() {
    return type;
  }
  
  /**
   * method returns integer if two entries are equal.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(number);
    result = prime * result + ((string == null) ? 0 : string.hashCode());
    result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }
  
  /**
   * method compares two entries and returns true/false based on if they are equal or not.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    if (Float.floatToIntBits(number) != Float.floatToIntBits(other.number)) {
      return false;
    }
    if (string == null) {
      if (other.string != null) {
        return false;
      }
    } else if (!string.equals(other.string)) {
      return false;
    }
    if (symbol != other.symbol) {
      return false;
    }
    if (type != other.type) {
      return false;
    }
    return true;
  }
  
  

}
