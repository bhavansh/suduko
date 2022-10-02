module dev.bhavansh.suduko {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.bhavansh.suduko to javafx.fxml;
    exports dev.bhavansh.suduko;
}