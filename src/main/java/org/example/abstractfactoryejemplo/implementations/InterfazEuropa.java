package org.example.abstractfactoryejemplo.implementations;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.Cliente;
import org.example.abstractfactoryejemplo.EuropaController;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;

import java.io.IOException;

public class InterfazEuropa implements InterfazGrafica {
    @Override
    public Parent cargarVista(Cliente cliente) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/abstractfactoryejemplo/fxml/europa-view.fxml"));
            Parent root = loader.load();

            EuropaController controller = loader.getController();
            controller.setClienteApp(cliente);

            String css = getClass().getResource("/org/example/abstractfactoryejemplo/styles/europa-style.css").toExternalForm();
            root.getStylesheets().add(css);

            return root;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
