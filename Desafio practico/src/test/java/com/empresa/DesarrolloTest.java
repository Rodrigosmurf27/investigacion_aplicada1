package com.empresa;


import com.empresa.departamento.Desarrollo;
import com.empresa.model.Desarrollador;
import com.empresa.model.Gerente;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DesarrolloTest {

    @Test
    public void testAgregarGerenteConEquipo() {
        Desarrollo desarrollo = new Desarrollo();
        Gerente gerente = new Gerente();
        gerente.setNombre("Ana");
        gerente.setEquipo(List.of(new Desarrollador(), new Desarrollador(), new Desarrollador()));

        assertDoesNotThrow(() -> desarrollo.agregarEmpleado(gerente));
    }

    @Test
    public void testAgregarGerenteSinEquipo() {
        Desarrollo desarrollo = new Desarrollo();
        Gerente gerente = new Gerente();
        gerente.setNombre("Ana");
        gerente.setEquipo(List.of(new Desarrollador(), new Desarrollador()));

        assertThrows(IllegalStateException.class, () -> desarrollo.agregarEmpleado(gerente));
    }
}
