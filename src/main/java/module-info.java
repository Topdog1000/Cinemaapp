module com.example.cinemaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.base;

    opens com.example.cinemaapp to javafx.fxml;
    exports com.example.cinemaapp;
}