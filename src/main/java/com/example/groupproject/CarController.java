/**
 *@Purpose: The purpose of this program is to create an app that always the user to
 * choose the make of the car, the model, the model, the location to deliver it to, the payment
 * type that they wish to do either pay in full or lease it. This app will also show the description
 * of each model car and will also allow the user to choose what features the user wishes to have on their
 * car.
 * @Author: Jake Seeber, Quinn Frank, Enrique Leon, Brett Bowling, Stephon Johnson
 * @Date: 11/19/2023
 * @Section: CSC 331-001-002-003
 */

package com.example.groupproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;



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

    private Map<String, String> colorToImagePathMap = new HashMap<>();


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

        setDefaultImage();

        //Here we assign each image to a color as well show how to find the image
        colorToImagePathMap.put("Black", "/images/blackJeep.jpg");
        colorToImagePathMap.put("Silver", "/images/silverJeep.jpg");
        colorToImagePathMap.put("Blue", "/images/blueJeep.jpg");
        colorToImagePathMap.put("Red", "/images/redJeep.jpg");
        colorToImagePathMap.put("Electric Green", "/images/electricGreenJeep.jpg");



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

//    private void getColorData(ActionEvent event){
//        String colorChoice = colorChoiceBox.getValue();
//
//        //This will help with what image is corresponding with what color the user has chosen
//        String imagePath = colorToImagePathMap.get(colorChoice);
//
//        switch (colorChoice) {
//            case "Black":
//                currentCar.setColor(colorChoice);
//                colorLabel.setText(colorInfo.getBlack());
//                updateCarImage(imagePath);
//                break;
//            case "Silver":
//                currentCar.setColor(colorChoice);
//                colorLabel.setText(colorInfo.getSilver());
//                updateCarImage(imagePath);
//                break;
//            case "Red":
//                currentCar.setColor(colorChoice);
//                colorLabel.setText(colorInfo.getRed());
//                updateCarImage(imagePath);
//                break;
//            case "Blue":
//                currentCar.setColor(colorChoice);
//                colorLabel.setText(colorInfo.getBlue());
//                updateCarImage(imagePath);
//                break;
//            case "Electric Green":
//                currentCar.setColor(colorChoice);
//                colorLabel.setText(colorInfo.getGreen());
//                updateCarImage(imagePath);
//                break;
//        }
//
//    }
private void getColorData(ActionEvent event) {
    String colorChoice = colorChoiceBox.getValue();

    if (colorChoice != null) {
        // This will help with what image is corresponding with what color the user has chosen
        String imagePath = colorToImagePathMap.get(colorChoice);

        if (imagePath != null) {
            switch (colorChoice) {
                case "Black":
                    currentCar.setColor(colorChoice);
                    colorLabel.setText(colorInfo.getBlack());
                    updateCarImage(imagePath);
                    break;
                case "Silver":
                    currentCar.setColor(colorChoice);
                    colorLabel.setText(colorInfo.getSilver());
                    updateCarImage(imagePath);
                    break;
                case "Red":
                    currentCar.setColor(colorChoice);
                    colorLabel.setText(colorInfo.getRed());
                    updateCarImage(imagePath);
                    break;
                case "Blue":
                    currentCar.setColor(colorChoice);
                    colorLabel.setText(colorInfo.getBlue());
                    updateCarImage(imagePath);
                    break;
                case "Electric Green":
                    currentCar.setColor(colorChoice);
                    colorLabel.setText(colorInfo.getGreen());
                    updateCarImage(imagePath);
                    break;
            }
        } else {
            System.out.println("Image path for color '" + colorChoice + "' is null");
        }
    } else {
        System.out.println("Color choice is null");
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


    private void updateCarImage(String imagePath) {
        if (imagePath != null) {
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image carImage = new Image(inputStream);
                carImageView.setImage(carImage);
            } else {
                System.out.println("Image file not found: " + imagePath);
                // You can set a default image here if desired
                // Example: carImageView.setImage(new Image("/images/defaultImage.jpg"));
            }
        } else {
            System.out.println("Image path is null");
            // You can set a default image here if desired
            // Example: carImageView.setImage(new Image("/images/defaultImage.jpg"));
        }
    }

    private String defaultImagePath = "/images/defaultImage.jpg";

    private void setDefaultImage() {
        InputStream defaultImageStream = getClass().getResourceAsStream(defaultImagePath);
        if (defaultImageStream != null) {
            Image defaultImage = new Image(defaultImageStream);
            carImageView.setImage(defaultImage);
        } else {
            System.out.println("Default image file not found: " + defaultImagePath);
        }
    }



}
