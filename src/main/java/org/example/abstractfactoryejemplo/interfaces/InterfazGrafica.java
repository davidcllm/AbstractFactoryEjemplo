package org.example.abstractfactoryejemplo.interfaces;

import javafx.scene.Parent;
import org.example.abstractfactoryejemplo.Cliente;

public interface InterfazGrafica {
    Parent cargarVista(Cliente cliente); // Regresa la raíz del FXML
}
