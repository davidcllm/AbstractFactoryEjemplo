package org.example.abstractfactoryejemplo.factory;

import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public interface RestWareFactory {
    InterfazGrafica crearInterfaz();
    ReporteFinanciero crearReporte();
}
