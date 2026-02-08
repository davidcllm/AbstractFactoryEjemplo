package org.example.abstractfactoryejemplo.factory;

import org.example.abstractfactoryejemplo.implementations.InterfazMexico;
import org.example.abstractfactoryejemplo.implementations.ReporteMexico;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class MexicoFactory implements RestWareFactory {
    @Override
    public InterfazGrafica crearInterfaz() {
        return new InterfazMexico();
    }

    @Override
    public ReporteFinanciero crearReporte() {
        return new ReporteMexico();
    }
}
