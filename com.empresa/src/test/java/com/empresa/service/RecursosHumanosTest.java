package com.empresa.service;

import com.empresa.department.Finanzas;
import com.empresa.model.Empresa;
import com.empresa.model.Desarrollador;
import com.empresa.department.RecursosHumanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {

    @Test
    void shouldContratarEmpleadoCuandoHayPresupuesto() {
        // Crear una empresa con presupuesto suficiente
        Empresa empresa = new Empresa(10000);

        // Crear una instancia de Finanzas
        Finanzas finanzas = new Finanzas();

        // Crear una instancia de Recursos Humanos con Empresa y Finanzas
        RecursosHumanos rh = new RecursosHumanos(empresa, finanzas); // Pasar ambos argumentos

        // Crear un empleado (Desarrollador)
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        // Contratar al empleado
        rh.contratar(dev);

        // Verificar que el empleado fue agregado a la lista de empleados
        assertTrue(empresa.getEmpleados().contains(dev));
    }

}