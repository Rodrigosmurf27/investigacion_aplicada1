package com.empresa.service;

import com.empresa.departmento.Finanzas;
import com.empresa.modelo.Desarrollador;
import com.empresa.modelo.Empresa;
import com.empresa.modelo.Gerente;
import com.empresa.departmento.RecursosHumanos;
import org.junit.jupiter.api.Test;


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

        Desarrollador desarrollador1 = new Desarrollador("Juan", 1, 5000, "Desarrollo","Java");
        Desarrollador desarrollador2 = new Desarrollador("Juan", 2, 5000, "Desarrollo","Java");

        List<Desarrollador> equipo = Arrays.asList(desarrollador1, desarrollador2);

        Gerente gerente = new Gerente("Ana", 2, 7000, "Desarrollo", equipo);

        rh.contratar(gerente);
        rh.despedir(gerente);

        // Verificar que el gerente no fue despedido
        assertTrue(empresa.getEmpleados().contains(gerente));
    }
}
