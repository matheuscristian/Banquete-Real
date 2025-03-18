package com.banquetereal.banquetereal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PagamentoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}