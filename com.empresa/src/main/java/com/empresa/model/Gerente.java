package com.empresa.model;

import java.util.List;

public class Gerente extends Empleado {
    private List<Desarrollador> equipo;

    public Gerente(String nombre, int id, double salario, String departamento, List<Desarrollador> equipo) {
        super(nombre, id, salario, departamento);
        this.equipo = equipo;
    }

    public boolean tieneEquipoValido() {
        return equipo != null && equipo.size() >= 3;
    }
}