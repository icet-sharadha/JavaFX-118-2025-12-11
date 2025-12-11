package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    public Label lblHello;
    public TextField txtUserName;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String text = txtUserName.getText();
        System.out.println(text);
        lblHello.setText("Hello, "+text+"!");
        System.out.println("Button Clicked!");
    }
}
