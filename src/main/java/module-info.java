module com.example.proiect_fis_aplicatie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proiect_fis_aplicatie to javafx.fxml;
    exports com.example.proiect_fis_aplicatie;
}