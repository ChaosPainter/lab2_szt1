module com.example.sz_tech_lab_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sz_tech_lab_2 to javafx.fxml;
    exports com.example.sz_tech_lab_2;
}