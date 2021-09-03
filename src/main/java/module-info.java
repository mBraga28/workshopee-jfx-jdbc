module workshop.jfx.jdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.Application to javafx.fxml;
    exports com.Application;
    exports com.gui;
    opens com.gui to javafx.fxml;
}