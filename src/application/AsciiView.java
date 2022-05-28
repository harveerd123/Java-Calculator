/**
 * This class is stored in application package as it is code required for the application to run.
 */

package application;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * This class implements a Ascii view.
 * @author Harveer Dole, code provided by Dave Cohen.
 */

public class AsciiView implements ViewInterface {
  private String question;
  Observer calc = null;
  Consumer<OpType> changeType = null;

  /**
   * method interprets user input.
   */
  public void menu() {
    Scanner s = new Scanner(System.in);
    boolean finished = false;
    help();

    // The order of these checks is critical because hasNext blocks
    while (!finished && s.hasNext()) {
      String t = s.next();
      switch (t.charAt(0)) {
        case 'C':
        case 'c':
          if (calc != null) {
            calc.tell();
          }
          break;
        case 'I':
        case 'i':
          if (changeType != null) {
            changeType.accept(OpType.INFIX);
          }
          break;
        case 'P':
        case 'p':
          if (changeType != null) {
            changeType.accept(OpType.POSTFIX);
          }
          break;
        case '?':
          question = t.substring(1);
          System.out.println("Question set to: " + question);
          break;
        case 'Q':
        case 'q':
          System.out.println("Bye");
          finished = true;
          break;
        default:
          help();
      }
    }
    s.close();
  }

  /**
   * method prints following on command line to help user make a choice.
   */
  private void help() {
    System.out.println("Use one of the following:");
    System.out.println("  ?Expression - to set expression");
    System.out.println("  P - to change to postfix");
    System.out.println("  I - to change to infix");
    System.out.println("  C - to calculate");
    System.out.println("  Q - to exit");
  }

  
  public void addCalcObserver(Observer f) {
    calc = f;
  }

  public void addTypeObserver(Consumer<OpType> l) {
    changeType = l;
  }

  public String getQuestion() {
    return question;
  }

  public void setAnswer(String a) {
    System.out.println("Answer is just around the corner");
  }

}

