package com.empresa.service;

import com.empresa.model.Desarrollador;
import com.empresa.model.Empresa;
import com.empresa.department.Finanzas;
import com.empresa.department.RecursosHumanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacionTest {

    @Test
    void shouldNotificarFinanzasAlContratarEmpleado() {
        // Crear una empresa con presupuesto suficiente
        Empresa empresa = new Empresa(10000);

        // Crear una instancia de Finanzas
        Finanzas finanzas = new Finanzas();

        // Crear una instancia de Recursos Humanos con Empresa y Finanzas
        RecursosHumanos rh = new RecursosHumanos(empresa, finanzas);

        // Crear un empleado (Desarrollador)
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        // Contratar al empleado
        rh.contratar(dev);

    }
}