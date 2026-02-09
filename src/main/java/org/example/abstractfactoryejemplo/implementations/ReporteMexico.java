package org.example.abstractfactoryejemplo.implementations;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class ReporteMexico implements ReporteFinanciero {
    @Override
    public double calcularUtilidad(double ingresos, double costos) {
        double utilidadBruta = ingresos - costos;
        return utilidadBruta * 0.68; // Se aplica el 32% de IVA
    }
}
