package org.example.abstractfactoryejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.abstractfactoryejemplo.factory.EuropaFactory;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class EuropaController {
    @FXML private TextField tfIngresosEuropa;
    @FXML private TextField tfCostosEuropa;
    @FXML private Label lblEuropa;

    // Obtenemos el reporte directamente de la fábrica de su región
    private ReporteFinanciero reporte = new EuropaFactory().crearReporte();

    @FXML
    protected void onCalcularUtilidadEuropa() {
        double ingresos = Double.parseDouble(tfIngresosEuropa.getText());
        double costos = Double.parseDouble(tfCostosEuropa.getText());

        double resultado = reporte.calcularUtilidad(ingresos, costos);
        lblEuropa.setText(String.format("%.2f", resultado));
    }
}
