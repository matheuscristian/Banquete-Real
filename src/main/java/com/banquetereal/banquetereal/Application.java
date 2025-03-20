package com.banquetereal.banquetereal;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("sobre.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Banquete Real");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void openPagamento() {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("pagamento.fxml"));
        Stage stage = new Stage();
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("pagamento");
        stage.setScene(scene);
        stage.show();
    }
}