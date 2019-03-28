package denysjfry.buttonchooser.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class ButtonFolderChooser extends ButtonChooser
{
  public ButtonFolderChooser()
  {
    super();
  }

  @Override
  String fxml()
  {
    return "/folder_chooser.fxml";
  }

  @FXML
  public void chooseFolder(ActionEvent event)
  {
    DirectoryChooser directoryChooser = new DirectoryChooser();
    directoryChooser.setTitle("Select folder");

    if (textField.getText() != null && !textField.getText().isEmpty())
    {
      String path = textField.getText().replace('/', '\\');
      File folder = new File(path);
      if (folder.exists())
        directoryChooser.setInitialDirectory(folder);
    }

    File selectedDirectory = directoryChooser.showDialog(stage);
    if (selectedDirectory != null)
    {
      textField.setText(selectedDirectory.getAbsolutePath());
    }
  }
}
