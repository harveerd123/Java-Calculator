/**
 * This class is stored in application package as it is code required for the application to run.
 */

package application;

import source.ArithmeticOverflowException;
import source.CalcModel;
import source.DivideByZeroException;
import source.InvalidException;

/**
 * This class communicates with CalcModel and the views.
 * @author Harveer Dole, code provided by Dave Cohen.
 *
 */

public class Controller {
  CalcModel calc = new CalcModel();
  boolean infix = true;
  
  ViewInterface myView = null;
  
  /**
   * method gets answer and shows it.
   */
  private void calculate() {
    try {
      Double answer = (double) calc.evaluate(myView.getQuestion(), infix);
      answer = Math.round(answer * 100.0) / 100.0;
      myView.setAnswer(answer.toString());
    }   catch (InvalidException | ArithmeticOverflowException | DivideByZeroException exception) {
      myView.setAnswer(exception.getMessage());
    }
  }
  
  /**
   * method changes expressionType.
   * @param type of Calculator required.
   */
  private void expressionType(OpType type) {
    myView.setAnswer("Changed to " + type);
    if (type == OpType.POSTFIX) {
      infix = false;
    }   else {
      infix = true;
    }
  }
  
  /**
   * constructor calls upon addCalcObserver & addTypeObserver methods with calculate 
   * & expressionType.
   * @param view is assigned in method.
   */
  public Controller(ViewInterface view) {
    myView = view;
    view.addCalcObserver(this::calculate);
    view.addTypeObserver(this::expressionType);
  }
  
}
