package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Customer;

public class SampleController {

    public TextField txtUserName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtSalary;
    public TextField txtId;

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

        int id = Integer.parseInt(txtId.getText());
        String userName = txtUserName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(email, userName, address, salary, id);
        System.out.println(customer);
    }
}
