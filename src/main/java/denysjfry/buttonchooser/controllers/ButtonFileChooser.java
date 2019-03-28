package denysjfry.buttonchooser.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;

import java.io.File;

public class ButtonFileChooser extends ButtonChooser
{
  public ButtonFileChooser()
  {
    super();
  }

  @Override
  String fxml()
  {
    return "/file_chooser.fxml";
  }

  @FXML
  public void chooseFile(ActionEvent event)
  {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Select file");

    if (extFilter != null)
    {
      fileChooser.getExtensionFilters().add(extFilter);
    }

    if (textField.getText() != null && !textField.getText().isEmpty())
    {
      String correctPath = textField.getText().replace('/', '\\');
      String pathToFolder = correctPath.substring(0, correctPath.lastIndexOf('\\'));

      File folder = new File(pathToFolder);
      if (folder.exists())
      {
        fileChooser.setInitialDirectory(folder);
      }
    }
    File selectedFile = fileChooser.showOpenDialog(stage);
    if (selectedFile != null)
    {
      textField.setText(selectedFile.getAbsolutePath());
    }
  }
}
