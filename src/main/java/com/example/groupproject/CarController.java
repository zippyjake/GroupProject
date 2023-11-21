package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CarController {

    @FXML
    private ImageView carImageView;

    @FXML
    private CheckBox cellularBox;

    @FXML
    private ChoiceBox<String> colorChoiceBox;

    @FXML
    private Label colorLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private CheckBox drivingBox;

    @FXML
    private CheckBox leatherBox;

    @FXML
    private ChoiceBox<String> locationChoiceBox;

    @FXML
    private ChoiceBox<String> modelChoiceBox;

    @FXML
    private Label modelLabel;

    @FXML
    private ChoiceBox<String> paymentChoiceBox;

    @FXML
    private Label paymentLabel;

    @FXML
    private Label shipmentLabel;

    @FXML
    private TextField totalTextField;

    @FXML
    private CheckBox windowLabel;

    // Car Creation
        // Initialize Cars Here

    // Create a Temp Car Object for easy selection

    ColorInfo colorInfo = new ColorInfo();

    // Data Sets
    private String[] modelData = {"Mangler", "Longitude", "ScaleMock", "Collaborator", "Cord", "Civil", "CP-R"};
        // Change to Initialized Cars
    private String[] colorData = {"Black", "Silver", "Red", "Blue", "Electric Green"};
    private String[] locationData = {"Charlotte", "Wilmington", "Raleigh", "Boone", "Greensboro", "New Bern"};
    private String[] paymentData = {"Pay in Full", "Lease"};


    public void initialize(){
        modelChoiceBox.getItems().addAll(modelData);
        modelChoiceBox.setOnAction(this::getModelData);
        modelChoiceBox.getSelectionModel().selectFirst();

        colorChoiceBox.getItems().addAll(colorData);
        colorChoiceBox.setOnAction(this::getColorData);
        colorChoiceBox.getSelectionModel().selectFirst();

        drivingBox.setOnAction(this::drivingBoxSelect);
        leatherBox.setOnAction(this::leatherBoxSelect);
        windowLabel.setOnAction(this::windowBoxSelect);
        cellularBox.setOnAction(this::cellularBoxSelect);

        locationChoiceBox.getItems().addAll(locationData);
        locationChoiceBox.setOnAction(this::getLocationData);
        locationChoiceBox.getSelectionModel().selectFirst();

        paymentChoiceBox.getItems().addAll(paymentData);
        paymentChoiceBox.setOnAction(this::getPaymentData);
        paymentChoiceBox.getSelectionModel().selectFirst();

    }

    private void getModelData(ActionEvent event) {
        String modelChoice = modelChoiceBox.getValue();
        switch (modelChoice) {
            case "Mangler":
                modelLabel.setText("This is a Mangler");
                break;
            case "Longitude":
                modelLabel.setText("This is a Longitude");
                break;
            case "ScaleMock":
                modelLabel.setText("Thus is a ScaleMock");
                break;
            case "Collaborator":
                modelLabel.setText("This is a Collaborator");
                break;
            case "Cord":
                modelLabel.setText("This is a Cord");
                break;
            case "Civil":
                modelLabel.setText("This is a Civil");
                break;
            case "CP-R":
                modelLabel.setText("This is a CP-R");
                break;
        }
    }

    private void getColorData(ActionEvent event){
        String colorChoice = colorChoiceBox.getValue();
        switch (colorChoice) {
            case "Black":
                colorLabel.setText(colorInfo.getBlack());
                break;
            case "Silver":
                colorLabel.setText(colorInfo.getSilver());
                break;
            case "Red":
                colorLabel.setText(colorInfo.getRed());
                break;
            case "Blue":
                colorLabel.setText(colorInfo.getBlue());
                break;
            case "Electric Green":
                colorLabel.setText(colorInfo.getGreen());
                break;
        }
    }

    private void drivingBoxSelect(ActionEvent event){
        if (drivingBox.isSelected()) {
            drivingBox.setText("Driving Assist (Selected)");
        }
        else {
            drivingBox.setText("Driving Assist");
        }
    }
    private void leatherBoxSelect(ActionEvent event){
        if (leatherBox.isSelected()) {
            leatherBox.setText("Leather Interior (Selected)");
        }
        else {
            leatherBox.setText("Leather Interior");
        }
    }

    private void windowBoxSelect(ActionEvent event){
        if (windowLabel.isSelected()) {
            windowLabel.setText("Tinted Windows (Selected)");
        }
        else {
            windowLabel.setText("Tinted Windows");
        }
    }

    private void cellularBoxSelect(ActionEvent event){
        if (cellularBox.isSelected()) {
            cellularBox.setText("Cellular (Selected)");
        }
        else {
            cellularBox.setText("Cellular");
        }
    }

    private void getLocationData(ActionEvent event) {
        String locationChoice = locationChoiceBox.getValue();
        switch (locationChoice) {
            case "Charlotte":
                shipmentLabel.setText("Location set to Charlotte");
                break;
            case "Wilmington":
                shipmentLabel.setText("Location set to Wilmington");
                break;
            case "Raleigh":
                shipmentLabel.setText("Location set to Raleigh");
                break;
            case "Boone":
                shipmentLabel.setText("Location set to Boone");
                break;
            case "Greensboro":
                shipmentLabel.setText("Location set to Greensboro");
                break;
            case "New Bern":
                shipmentLabel.setText("Location set to New Bern");
                break;
        }
    }

    private void getPaymentData(ActionEvent event) {
        String paymentChoice = paymentChoiceBox.getValue();
        switch (paymentChoice) {
            case "Pay in Full":
                paymentLabel.setText("Full Payment");
                break;
            case "Lease":
                paymentLabel.setText("Total, You will pay XXX per month");
                break;
        }
    }

}
