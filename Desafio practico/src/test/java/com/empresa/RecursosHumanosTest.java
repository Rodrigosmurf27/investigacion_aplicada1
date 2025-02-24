package com.empresa;

import com.empresa.departamento.RecursosHumanos;
import com.empresa.model.Desarrollador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursosHumanosTest {

    @Test
    public void testContratarEmpleadoConPresupuesto() {
        RecursosHumanos rh = new RecursosHumanos();
        rh.setPresupuesto(10000);
        Desarrollador dev = new Desarrollador();
        dev.setNombre("Juan");
        dev.setSalario(5000);

        rh.contratar(dev);

        assertTrue(rh.getEmpleados().contains(dev));
        assertEquals(5000, rh.getPresupuesto());
    }

    @Test
    public void testContratarEmpleadoSinPresupuesto() {
        RecursosHumanos rh = new RecursosHumanos();
        rh.setPresupuesto(1000);
        Desarrollador dev = new Desarrollador();
        dev.setNombre("Juan");
        dev.setSalario(5000);

        assertThrows(IllegalStateException.class, () -> rh.contratar(dev));
    }
}