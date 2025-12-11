package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class SampleController {

    public TextField txtUserName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtSalary;
    public TextField txtId;
    public TableView tblCustomerList;
    public TableColumn colId;
    public TableColumn colUserNAme;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colEmail;

    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

        int id = Integer.parseInt(txtId.getText());
        String userName = txtUserName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(email, userName, address, salary, id);
        System.out.println(customer);
        customerArrayList.add(customer);

        System.out.println(customerArrayList);
    }

    public void btnReloadOnAction(ActionEvent actionEvent) {
        loadTable();
    }
    private void loadTable(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUserNAme.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        tblCustomerList.setItems(FXCollections.observableList(customerArrayList));
    }


}
