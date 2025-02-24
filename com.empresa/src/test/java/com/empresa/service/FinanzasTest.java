package com.empresa.service;

import com.empresa.model.Empresa;
import com.empresa.model.Desarrollador;
import com.empresa.department.Finanzas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanzasTest {

    @Test
    void shouldProcesarPagoCuandoEmpleadoEstaActivo() {
        Empresa empresa = new Empresa(10000);
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");
        Finanzas finanzas = new Finanzas();

        finanzas.procesarPago(dev);

        // Verificar que el pago se procesó correctamente
        assertTrue(dev.isActivo());
    }

    @Test
    void shouldNotProcesarPagoCuandoEmpleadoEstaInactivo() {
        Empresa empresa = new Empresa(10000);
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");
        dev.setActivo(false);
        Finanzas finanzas = new Finanzas();

        finanzas.procesarPago(dev);

        // Verificar que el pago no se procesó
        assertFalse(dev.isActivo());
    }
}
