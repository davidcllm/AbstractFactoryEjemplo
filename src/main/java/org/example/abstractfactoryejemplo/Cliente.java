package org.example.abstractfactoryejemplo;

import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.factory.RestWareFactory;
import org.example.abstractfactoryejemplo.interfaces.InterfazGrafica;
import org.example.abstractfactoryejemplo.interfaces.ReporteFinanciero;

public class Cliente {
    private InterfazGrafica interfaz;
    private ReporteFinanciero reporte;

    // El cliente recibe la fábrica por inyectar dependencias
    public Cliente(RestWareFactory factory) {
        this.interfaz = factory.crearInterfaz();
        this.reporte = factory.crearReporte();
    }

    public Parent obtenerVista() {
        return interfaz.cargarVista(this);
    }

    public double calcularUtilidad(double ingresos, double costos) {
        return reporte.calcularUtilidad(ingresos, costos);
    }
}
