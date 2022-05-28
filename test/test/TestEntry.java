/**
 * This class is stored in test package as it is a JUnit test case.
 */

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import source.BadTypeException;
import source.Entry;
import source.Symbol;
import source.Type;

/**
 * This class is created to test for entries with different parameters.
 * @author Harveer Dole
 */
class TestEntry {
  
  /**
   * test1. To pass test, Entry class created & constructor made which takes parameter. getValue
   * method returns 1f(passes first assert command). Then float variable created & constructor
   * assigns parameter with new variable. getValue will now return float variable created.
   */
  @Test
  void createEntryFloat() {
    Entry entry1 = new Entry(1f);
    assertEquals(1f, entry1.getValue(), 0);
    
    Entry entry2 = new Entry(2f);
    assertEquals(2f, entry2.getValue(), 0);
    
  }

  /**
   * test2. To pass test, constructor made that takes parameter. getString method returns "3 + 4".
   * (passes first assert command). Then String variable created & constructor assigns variable.
   * getString method will now return String variable.
   */
  @Test
  void createEntryString() {
    Entry entry3 = new Entry("3 + 4");
    assertEquals("3 + 4", entry3.getString());
    
    Entry entry4 = new Entry("2 * 3");
    assertEquals("2 * 3", entry4.getString());
  }

  /**
   * test3. To pass test, constructor made that takes parameter. getSymbol method returns '+'.
   * first assert command passed). Then Symbol variable created which constructor takes as parameter
   * & assigns. getSymbol must now return symbol associated with name so in Symbol class getSymbol
   * method created to return symbol. New method then called upon in getSymbol method of entry.
   */
  @Test
  void createEntrySymbol() {
    Entry entry5 = new Entry(Symbol.PLUS);
    assertEquals('+', entry5.getSymbol());
    
    Entry entry6 = new Entry(Symbol.MINUS);
    assertEquals('-', entry6.getSymbol());
  }

  /**
   * test4. To pass test, getType method returns Type.NUMBER(to pass first assert command).
   * Then Type variable created & for each constructor type is assigned correctly to type
   * of values it accepts. GetType method now returns Type variable.
   */
  @Test
  void checkTypeOfEntry() {
    Entry entry7 = new Entry(7f);
    assertEquals(Type.NUMBER, entry7.getType());
    
    Entry entry8 = new Entry("3 + 7");
    assertEquals(Type.STRING, entry8.getType());
    
    Entry entry9 = new Entry(Symbol.LEFTBRACKET);
    assertEquals(Type.SYMBOL, entry9.getType());
  }
  
  /**
   * test5. To pass test BadTypeException class created with constructor so that message is printed
   * when exception thrown. getSymbol, getString, getValue methods now throw exception if Type 
   * variable is not correct.
   */
  @Test
  void exceptionThrownTest() {
    Entry entry10 = new Entry(50f);
    assertThrows(BadTypeException.class, () -> {
      entry10.getSymbol();
    });
    
    try {
      entry10.getString();
    }   catch (BadTypeException exception) {
      assertEquals("Something has gone wrong", exception.getMessage());
      
    }
    
    Entry entry11 = new Entry("3 * 2");
    assertThrows(BadTypeException.class, () -> {
      entry11.getValue();
    });
  }

  /**
   * test6. To pass test a equals() and hashcode() method is implemented into entry class 
   * via eclipse.
   */
  @Test
  void checkEqualEntries() {
    Entry entry12 = new Entry(Symbol.PLUS);
    Entry entry13 = new Entry(Symbol.MINUS);
    assertFalse(entry12.equals(entry13));
    
    Entry entry14 = new Entry(10f);
    Entry entry15 = new Entry(10f);
    assertTrue(entry14.equals(entry15));
    
    Entry entry16 = new Entry("5/1");
    Entry entry17 = new Entry("5/1");
    assertTrue(entry16.equals(entry17));
    assertTrue(entry16.hashCode() == entry17.hashCode());
  }
  
}
