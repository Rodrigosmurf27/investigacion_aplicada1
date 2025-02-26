package com.empresa.service;

import com.empresa.modelo.Desarrollador;
import com.empresa.modelo.Empresa;
import com.empresa.departmento.Finanzas;
import com.empresa.departmento.RecursosHumanos;
import org.junit.jupiter.api.Test;


class NotificacionTest {

    @Test
    void shouldNotificarFinanzasAlContratarEmpleado() {
        // Crea una empresa con presupuesto suficiente
        Empresa empresa = new Empresa(10000);

        // Crea una instancia de Finanzas
        Finanzas finanzas = new Finanzas();

        // Crea una instancia de Recursos Humanos con Empresa y Finanzas
        RecursosHumanos rh = new RecursosHumanos(empresa, finanzas);

        // Crea un empleado (Desarrollador)
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        // Notificacin para contratar al empleado
        rh.contratar(dev);

    }
}