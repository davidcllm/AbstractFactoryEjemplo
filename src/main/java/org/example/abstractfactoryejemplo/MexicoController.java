package org.example.abstractfactoryejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.abstractfactoryejemplo.factory.MexicoFactory;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class MexicoController {
    @FXML private TextField tfIngresosMexico;
    @FXML private TextField tfCostosMexico;
    @FXML private Label lblMexico;

    // Atributo para guardar la referencia al cliente
    private Cliente clienteApp;

    public void setClienteApp(Cliente cliente) {
        this.clienteApp = cliente;
    }

    // Obtenemos el reporte directamente de la fábrica de su región
    private ReporteFinanciero reporte = new MexicoFactory().crearReporte();

    @FXML
    protected void onCalcularUtilidadMexico() {
        double ingresos = Double.parseDouble(tfIngresosMexico.getText());
        double costos = Double.parseDouble(tfCostosMexico.getText());

        double resultado = reporte.calcularUtilidad(ingresos, costos);
        lblMexico.setText(String.format("%.2f", resultado));
    }
}
