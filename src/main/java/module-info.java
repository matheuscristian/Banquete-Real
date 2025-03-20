module com.banquetereal.banquetereal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.banquetereal.banquetereal to javafx.fxml;
    exports com.banquetereal.banquetereal;
}