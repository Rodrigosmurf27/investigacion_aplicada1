package com.empresa;

import com.empresa.departamento.Finanzas;
import com.empresa.model.Desarrollador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinanzasTest {

    @Test
    public void testProcesarPagoEmpleadoActivo() {
        Finanzas finanzas = new Finanzas();
        Desarrollador dev = new Desarrollador();
        dev.setNombre("Juan");
        dev.setProyectoAsignado("Proyecto A");
        finanzas.agregarEmpleado(dev);

        assertDoesNotThrow(() -> finanzas.procesarPago(dev));
    }

    @Test
    public void testProcesarPagoEmpleadoInactivo() {
        Finanzas finanzas = new Finanzas();
        Desarrollador dev = new Desarrollador();
        dev.setNombre("Juan");

        assertThrows(IllegalStateException.class, () -> finanzas.procesarPago(dev));
    }
}