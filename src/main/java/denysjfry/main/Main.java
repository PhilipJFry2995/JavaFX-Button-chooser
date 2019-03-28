package denysjfry.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
    Parent root = loader.load();

    Scene scene = new Scene(root, 1700, 900);
    primaryStage.setScene(scene);
    primaryStage.setMinWidth(700.0);
    primaryStage.setMinHeight(400.0);
    primaryStage.setTitle("Title");
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}
