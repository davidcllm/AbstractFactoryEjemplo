package org.example.abstractfactoryejemplo.implementations;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;

import java.io.IOException;

public class InterfazEuropa implements InterfazGrafica {
    @Override
    public Parent cargarVista() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/europa-view.fxml"));
            Parent root = loader.load();

            // Se importa el estilo en la vista
            root.getStylesheets().add(getClass().getResource("styles/europa-style.css").toExternalForm());
            return root;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
