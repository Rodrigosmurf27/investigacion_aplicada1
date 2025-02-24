package com.empresa.service;

import com.empresa.department.Finanzas;
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
        Finanzas finanzas = new Finanzas();
        RecursosHumanos rh = new RecursosHumanos(empresa, finanzas);
        Gerente gerente = new Gerente("Ana", 2, 7000, "Desarrollo", Collections.emptyList()); // Equipo vacío

        rh.contratar(gerente);
        rh.despedir(gerente);

        // Verificar que el gerente no fue despedido
        assertTrue(empresa.getEmpleados().contains(gerente));
    }

}
