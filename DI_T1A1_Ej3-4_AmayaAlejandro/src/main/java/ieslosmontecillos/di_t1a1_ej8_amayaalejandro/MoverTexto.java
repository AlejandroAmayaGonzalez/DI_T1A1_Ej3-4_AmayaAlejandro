package ieslosmontecillos.di_t1a1_ej8_amayaalejandro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MoverTexto extends Application {

    private double x = 0, y = 0;

    @Override
    public void start(Stage stage) throws IOException {

        //Contenedor
        Pane root = new Pane();

        //Componentes
        Label etiqueta = new Label("Programming is fun!");
        etiqueta.setLayoutX(50);
        etiqueta.setLayoutY(50);

        etiqueta.setOnMouseDragged(e -> {
            //Mover la etiqueta con la posición del ratón
            etiqueta.setLayoutX(e.getSceneX() - x);
            etiqueta.setLayoutY(e.getSceneY() - y);
        });

        //Añadimos los componentes
        root.getChildren().add(etiqueta);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("MoverTexto");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}