module com.Application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.Application to javafx.fxml;
    exports com.Application;
    exports com.gui;
    opens com.gui to javafx.fxml, javafx.graphics;
    opens com.model.entities to javafx.base, javafx.graphics;
    opens com.model.services to javafx.base, javafx.graphics;
}