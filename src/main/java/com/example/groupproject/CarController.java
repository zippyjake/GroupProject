package com.example.groupproject;

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
    private ChoiceBox<?> colorChoiceBox;

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
    private ChoiceBox<?> modelChoiceBox;

    @FXML
    private Label modelLabel;

    @FXML
    private ChoiceBox<?> paymentChoiceBox;

    @FXML
    private TextField totalTextField;

    @FXML
    private CheckBox windowLabel;

}
