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
    CarSuperClass car1 = new CarSuperClass("Make1", "Model1", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car2 = new CarSuperClass("Make2", "Model2", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car3 = new CarSuperClass("Make3", "Model3", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car4 = new CarSuperClass("Make4", "Model4", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car5 = new CarSuperClass("Make5", "Model5", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car6 = new CarSuperClass("Make6", "Model6", "Black", false, false, false, false, 1000, 2200);
    CarSuperClass car7 = new CarSuperClass("Make7", "Model7", "Black", false, false, false, false, 1000, 2200);

    // Create a Temp Car Object for easy selection
    CarSuperClass currentCar = car1;

    ColorInfo colorInfo = new ColorInfo();
    ShippingInfo shippingInfo = new ShippingInfo();

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
                currentCar = car1;
                modelLabel.setText(currentCar.toString());
                break;
            case "Longitude":
                currentCar = car2;
                modelLabel.setText(currentCar.toString());
                break;
            case "ScaleMock":
                currentCar = car3;
                modelLabel.setText(currentCar.toString());
                break;
            case "Collaborator":
                currentCar = car4;
                modelLabel.setText(currentCar.toString());
                break;
            case "Cord":
                currentCar = car5;
                modelLabel.setText(currentCar.toString());
                break;
            case "Civil":
                currentCar = car6;
                modelLabel.setText(currentCar.toString());
                break;
            case "CP-R":
                currentCar = car7;
                modelLabel.setText(currentCar.toString());
                break;
        }

        currentCar.setColor(colorChoiceBox.getValue());

        if (drivingBox.isSelected()) {
            drivingBox.setText("Driving Assist (Selected)");
            currentCar.setAssist(true);
        }
        else {
            drivingBox.setText("Driving Assist");
            currentCar.setAssist(false);
        }
        if (leatherBox.isSelected()) {
            leatherBox.setText("Leather Interior (Selected)");
            currentCar.setLeather(true);
        }
        else {
            leatherBox.setText("Leather Interior");
            currentCar.setLeather(false);
        }
        if (windowLabel.isSelected()) {
            windowLabel.setText("Tinted Windows (Selected)");
            currentCar.setTinted(true);
        }
        else {
            windowLabel.setText("Tinted Windows");
            currentCar.setTinted(false);
        }
        if (cellularBox.isSelected()) {
            cellularBox.setText("Cellular (Selected)");
            currentCar.setCellular(true);
        }
        else {
            cellularBox.setText("Cellular");
            currentCar.setCellular(false);
        }

    }

    private void getColorData(ActionEvent event){
        String colorChoice = colorChoiceBox.getValue();
        switch (colorChoice) {
            case "Black":
                currentCar.setColor(colorChoice);
                colorLabel.setText(colorInfo.getBlack());
                break;
            case "Silver":
                currentCar.setColor(colorChoice);
                colorLabel.setText(colorInfo.getSilver());
                break;
            case "Red":
                currentCar.setColor(colorChoice);
                colorLabel.setText(colorInfo.getRed());
                break;
            case "Blue":
                currentCar.setColor(colorChoice);
                colorLabel.setText(colorInfo.getBlue());
                break;
            case "Electric Green":
                currentCar.setColor(colorChoice);
                colorLabel.setText(colorInfo.getGreen());
                break;
        }

    }

    private void drivingBoxSelect(ActionEvent event){
        if (drivingBox.isSelected()) {
            drivingBox.setText("Driving Assist (Selected)");
            currentCar.setAssist(true);
        }
        else {
            drivingBox.setText("Driving Assist");
            currentCar.setAssist(false);
        }
    }
    private void leatherBoxSelect(ActionEvent event){
        if (leatherBox.isSelected()) {
            leatherBox.setText("Leather Interior (Selected)");
            currentCar.setLeather(true);
        }
        else {
            leatherBox.setText("Leather Interior");
            currentCar.setLeather(false);
        }
    }

    private void windowBoxSelect(ActionEvent event){
        if (windowLabel.isSelected()) {
            windowLabel.setText("Tinted Windows (Selected)");
            currentCar.setTinted(true);
        }
        else {
            windowLabel.setText("Tinted Windows");
            currentCar.setTinted(false);
        }
    }

    private void cellularBoxSelect(ActionEvent event){
        if (cellularBox.isSelected()) {
            cellularBox.setText("Cellular (Selected)");
            currentCar.setCellular(true);
        }
        else {
            cellularBox.setText("Cellular");
            currentCar.setCellular(false);
        }
    }

    private void getLocationData(ActionEvent event) {
        String locationChoice = locationChoiceBox.getValue();
        switch (locationChoice) {
            case "Charlotte":
                shipmentLabel.setText(shippingInfo.getCharlotte());
                break;
            case "Wilmington":
                shipmentLabel.setText(shippingInfo.getWilmington());
                break;
            case "Raleigh":
                shipmentLabel.setText(shippingInfo.getRaleigh());
                break;
            case "Boone":
                shipmentLabel.setText(shippingInfo.getBoone());
                break;
            case "Greensboro":
                shipmentLabel.setText(shippingInfo.getGreensBoro());
                break;
            case "New Bern":
                shipmentLabel.setText(shippingInfo.getNewBern());
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
