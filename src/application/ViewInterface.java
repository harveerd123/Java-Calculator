/**
 * This class is stored in application package as it is code required for the application to run.
 */

package application;

import java.util.function.Consumer;

/**
 * This class implements a interface for the views to implement.
 * @author Harveer Dole, code provided by Dave Cohen.
 */
public interface ViewInterface {
  void addCalcObserver(Observer f);

  void addTypeObserver(Consumer<OpType> l);

  String getQuestion();

  void setAnswer(String a);

}
