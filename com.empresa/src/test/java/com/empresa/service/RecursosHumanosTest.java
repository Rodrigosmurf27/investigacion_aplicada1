package com.empresa.service;

import com.empresa.model.Empresa;
import com.empresa.model.Desarrollador;
import com.empresa.department.RecursosHumanos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {

    @Test
    void shouldContratarEmpleadoCuandoHayPresupuesto() {
        Empresa empresa = new Empresa(10000);
        RecursosHumanos rh = new RecursosHumanos(empresa);
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        rh.contratar(dev);

        assertTrue(empresa.getEmpleados().contains(dev));
    }

    @Test
    void shouldNotContratarEmpleadoCuandoNoHayPresupuesto() {
        Empresa empresa = new Empresa(1000);
        RecursosHumanos rh = new RecursosHumanos(empresa);
        Desarrollador dev = new Desarrollador("Juan", 1, 5000, "Desarrollo", "Proyecto X");

        rh.contratar(dev);

        assertFalse(empresa.getEmpleados().contains(dev));
    }
}