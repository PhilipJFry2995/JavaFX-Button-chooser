package denysjfry.buttonchooser.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class ButtonChooser extends HBox
{
  Stage stage;

  @FXML TextField textField;
  @FXML Button button;

  @FXML FileChooser.ExtensionFilter extFilter;

  public ButtonChooser()
  {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml()));
    fxmlLoader.setRoot(this);
    fxmlLoader.setController(this);

    try
    {
      fxmlLoader.load();
    }
    catch (IOException exception)
    {
      throw new RuntimeException(exception);
    }
  }

  abstract String fxml();

  protected void setFilter(FileChooser.ExtensionFilter filter)
  {
    this.extFilter = filter;
  }

  protected void setStage(Stage stage)
  {
    this.stage = stage;
  }
}
