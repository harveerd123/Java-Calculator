/**
 * This class is stored in application package as it is code required for the application to run.
 */

package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class runs the application and the views.
 * @author Harveer Dole, code provided by Dave Cohen.
 *
 */
public class Main extends Application {

  static FXMLLoader loader;
  static Parent root;

  @Override
  public void start(Stage primaryStage) {
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * method runs the application.
   * @param args The command line arguments
   * @throws IOException The program exits if it cannot start the GUI
   * 
   *                     Bizarrely, and due to a quirk of JavaFx, we have to call
   *                     FXMLLoader from the main() method within an Application
   *                     class. Hence the mess, rather than having a separate
   *                     Runner and Application
   */
  public static void main(String[] args) throws IOException {
    Boolean ascii = false;
    ViewInterface v;

    if (System.console() != null) {
      ascii = true;
    }

    // Create desired view type.
    if (ascii) {
      v = new AsciiView();
    } else {
      loader = new FXMLLoader(application.Main.class.getResource("GuiConfig.fxml"));
      root = loader.load();
      v = loader.getController();
    }

    // Controller is decoupled from the actual type of view
    new Controller(v);

    // Start collecting user interactions
    if (ascii) {
      ((AsciiView) v).menu();
      // We need to explicitly exit here because the Application has been
      // automatically started
      System.exit(0);
    } else {
      Application.launch(args);
    }
  }
}
