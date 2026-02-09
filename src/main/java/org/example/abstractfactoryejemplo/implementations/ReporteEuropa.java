package org.example.abstractfactoryejemplo.implementations;

import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class ReporteEuropa implements ReporteFinanciero {
    @Override
    public double calcularUtilidad(double ingresos, double costos) {
        double utilidadBruta = ingresos - costos;
        return utilidadBruta * 0.65; // Se aplica el 35% de IVA
    }
}
