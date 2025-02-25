package com.empresa.service;

import com.empresa.departmento.Finanzas;
import com.empresa.modelo.Empresa;
import com.empresa.modelo.Desarrollador;
import com.empresa.departmento.RecursosHumanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {

    @Test
    void shouldContratarEmpleadoCuandoHayPresupuesto() {
        // Crea una empresa con presupuesto suficiente
        Empresa empresa = new Empresa(5000);

        // Crea una instancia de Finanzas
        Finanzas finanzas = new Finanzas();

        // Crea una instancia de Recursos Humanos con Empresa y Finanzas
        RecursosHumanos rh = new RecursosHumanos(empresa, finanzas); // Pasar ambos argumentos

        // Crea un empleado (Desarrollador)
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        // Contrata al empleado
        rh.contratar(dev);

        // Verificacion que el empleado fue agregado a la lista de empleados
        assertTrue(empresa.getEmpleados().contains(dev));
    }

}