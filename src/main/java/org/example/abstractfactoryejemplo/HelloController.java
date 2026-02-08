package org.example.abstractfactoryejemplo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.abstractfactoryejemplo.factory.EuropaFactory;
import org.example.abstractfactoryejemplo.factory.MexicoFactory;
import org.example.abstractfactoryejemplo.factory.RestWareFactory;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;

public class HelloController {
    @FXML
    protected void onAbrirMexico() {
        abrirRegion(new MexicoFactory());
    }

    @FXML
    protected void onAbrirEuropa() {
        abrirRegion(new EuropaFactory());
    }

    private void abrirRegion(RestWareFactory factory) {
        try {
            // Usamos la fábrica para obtener la interfaz
            InterfazGrafica gui = factory.crearInterfaz();

            Stage stage = new Stage();
            stage.setScene(new Scene(gui.cargarVista()));
            stage.setTitle("Sistema RestWare");
            stage.show();

            // Se pasa el reporte al controlador de la nueva ventana
            // pero de forma genérica para no romper el patrón.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}