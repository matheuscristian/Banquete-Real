module com.banquetereal.banquetereal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.banquetereal.banquetereal to javafx.fxml;
    exports com.banquetereal.banquetereal;
}