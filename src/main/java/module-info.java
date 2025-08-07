module org.javaclass.arrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.javaclass.arrays to javafx.fxml;
    exports org.javaclass.arrays;
    exports org.javaclass.arrays.exercises;
    opens org.javaclass.arrays.exercises to javafx.fxml;
}