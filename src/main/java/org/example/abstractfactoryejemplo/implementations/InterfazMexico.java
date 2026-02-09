package org.example.abstractfactoryejemplo.implementations;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.Cliente;
import org.example.abstractfactoryejemplo.MexicoController;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;

import java.io.IOException;

public class InterfazMexico implements InterfazGrafica {
    @Override
    public Parent cargarVista(Cliente cliente) { // Recibe el cliente para inyectarlo
        try {
            // Ruta absoluta desde la raíz de resources
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/abstractfactoryejemplo/fxml/mexico-view.fxml"));
            Parent root = loader.load();

            // Inyección del cliente en el controlador de la vista
            MexicoController controller = loader.getController();
            controller.setClienteApp(cliente);

            // Ruta absoluta para el CSS
            String css = getClass().getResource("/org/example/abstractfactoryejemplo/styles/mexico-style.css").toExternalForm();
            root.getStylesheets().add(css);

            return root;
        } catch (IOException e) {
            System.err.println("Error cargando mexico-view.fxml. Revisa que el archivo esté en src/main/resources/org/example/abstractfactoryejemplo/fxml/");
            e.printStackTrace();
            return null;
        }
    }
}
