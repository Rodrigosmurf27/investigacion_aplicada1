package com.empresa.service;

import com.empresa.model.Empresa;
import com.empresa.model.Gerente;
import com.empresa.department.RecursosHumanos;
import org.junit.jupiter.api.Test;
import com.empresa.model.Desarrollador;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesarrolloTest {

    @Test
    void shouldNotDespedirGerenteConEquipoInvalido() {
        Empresa empresa = new Empresa(10000);
        RecursosHumanos rh = new RecursosHumanos(empresa);
        Gerente gerente = new Gerente("Ana", 2, 7000, "Desarrollo", Collections.emptyList()); // Equipo vacío

        rh.contratar(gerente);
        rh.despedir(gerente);

        // Verificar que el gerente no fue despedido
        assertTrue(empresa.getEmpleados().contains(gerente));
    }

    @Test
    void shouldDespedirGerenteConEquipoValido() {
        // Crear una empresa con presupuesto suficiente
        Empresa empresa = new Empresa(10000);
        RecursosHumanos rh = new RecursosHumanos(empresa);

        // Crear un equipo de 3 desarrolladores
        Desarrollador dev1 = new Desarrollador("Juan", 1, 3000, "Desarrollo", "Proyecto X");
        Desarrollador dev2 = new Desarrollador("Ana", 2, 3000, "Desarrollo", "Proyecto X");
        Desarrollador dev3 = new Desarrollador("Pedro", 3, 3000, "Desarrollo", "Proyecto X");
        List<Desarrollador> equipo = Arrays.asList(dev1, dev2, dev3);

        // Crear un gerente con el equipo válido
        Gerente gerente = new Gerente("Carlos", 4, 7000, "Desarrollo", equipo);


        // Despedir al gerente
        rh.despedir(gerente);

        // Verificar que el gerente fue despedido
        assertFalse(empresa.getEmpleados().contains(gerente));
    }
}
