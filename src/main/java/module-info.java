module org.javaclass.arrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.javaclass.arrays to javafx.fxml;
    exports org.javaclass.arrays;
}