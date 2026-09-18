module workshop_javafx_jdbc {

    requires javafx.controls;
    requires javafx.fxml;

    exports application;
    exports gui;
    exports model.entites;

    opens gui to javafx.fxml;
    opens model.entites to javafx.base;
}