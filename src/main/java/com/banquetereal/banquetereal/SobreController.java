package com.banquetereal.banquetereal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class SobreController {
    @FXML
    AnchorPane anchorPane;

    @FXML
    void goPagamento() {
        Application.openPagamento();
    }

    @FXML
    public void goCasamento() {
        Parent root;
        try {
            root = FXMLLoader.load(Application.class.getResource("casamento.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void goFestaDeQuinze() {
        Parent root;
        try {
            root = FXMLLoader.load(Application.class.getResource("festaDeQuinze.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void goConfraternizacao() {
        Parent root;
        try {
            root = FXMLLoader.load(Application.class.getResource("confraternizacao.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
