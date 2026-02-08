package org.example.abstractfactoryejemplo.factory;

import org.example.abstractfactoryejemplo.implementations.InterfazEuropa;
import org.example.abstractfactoryejemplo.implementations.ReporteEuropa;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class EuropaFactory implements RestWareFactory {
    @Override
    public InterfazGrafica crearInterfaz() {
        return new InterfazEuropa();
    }

    @Override
    public ReporteFinanciero crearReporte() {
        return new ReporteEuropa();
    }
}
