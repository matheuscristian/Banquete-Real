package com.banquetereal.banquetereal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfraternizacaoController {
    @FXML
    Pane pane;

    @FXML
    public void goSobre() {
        Parent root;
        try {
            root = FXMLLoader.load(Application.class.getResource("sobre.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) pane.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void goPagamento() {
        Application.openPagamento();
    }
}
