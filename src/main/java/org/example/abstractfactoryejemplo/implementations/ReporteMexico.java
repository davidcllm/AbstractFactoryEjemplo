package org.example.abstractfactoryejemplo.implementations;

import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class ReporteMexico implements ReporteFinanciero {
    @Override
    public double calcularUtilidad(double ingresos, double costos) {
        double utilidadBruta = ingresos - costos;
        return utilidadBruta * 0.84; // Se aplica el 16% de IVA
    }
}
