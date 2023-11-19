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
    private ChoiceBox<?> locationChoiceBox;

    @FXML
    private ChoiceBox<String> modelChoiceBox;

    @FXML
    private Label modelLabel;

    @FXML
    private ChoiceBox<?> paymentChoiceBox;

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


    public void initialize(){
        modelChoiceBox.getItems().addAll(modelData);
        modelChoiceBox.setOnAction(this::getModelData);
        modelChoiceBox.getSelectionModel().selectFirst();

        colorChoiceBox.getItems().addAll(colorData);
        colorChoiceBox.setOnAction(this::getColorData);
        colorChoiceBox.getSelectionModel().selectFirst();

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
                modelLabel.setText("This is aCP-R");
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



}
