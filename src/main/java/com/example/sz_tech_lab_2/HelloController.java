package com.example.sz_tech_lab_2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label labelText;
    @FXML
    private ImageView imgView;

    @FXML
    protected void onHelloButtonClick() {

        labelText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void blueButtonClick()
    {
        labelText.setTextFill(Color.BLUE);
    }

    @FXML
    private void greenButtonClick()
    {
        labelText.setTextFill(Color.GREEN);
    }

    @FXML
    private void redButtonClick()
    {
        labelText.setTextFill(Color.RED);
    }

    @FXML
    private void oneButtonClick()
    {
        labelText.setText("=1");
    }

    @FXML
    private void twoButtonClick()
    {
        labelText.setText("=2");
    }
    @FXML
    private void threeButtonClick()
    {
        labelText.setText("=3");
    }
    @FXML
    private void closeMenuClick()
    {
        Platform.exit();
    }
    @FXML
    private void calendarButtonClick()
    {
        imgView.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
}
    @FXML
    private void contactsButtonClick()
    {
        imgView.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
    }
    @FXML
    private void homeButtonClick()
    {
        imgView.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
    }

}