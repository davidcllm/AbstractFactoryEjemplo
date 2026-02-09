package org.example.abstractfactoryejemplo;

import javafx.fxml.FXML;
import javafx.scene.Parent;
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
            // Se crea el Cliente inyectándole la fábrica (México o Europa)
            Cliente cliente = new Cliente(factory);

            // El cliente internamente llamará a interfaz.cargarVista(this)
            Parent vista = cliente.obtenerVista();

            if (vista != null) {
                Stage stage = new Stage();
                Scene scene = new Scene(vista, 360, 470);

                stage.setScene(scene);
                stage.setTitle("Sistema RestWare - " + factory.getClass().getSimpleName());
                stage.show();
            }

        } catch (Exception e) {
            System.err.println("Error al abrir la región.");
            e.printStackTrace();
        }
    }
}