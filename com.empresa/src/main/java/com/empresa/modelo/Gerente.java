package com.empresa.modelo;

import java.util.List;

public class Gerente extends Empleado {
    private List<Desarrollador> equipo;

    public Gerente(String nombre, int id, double salario, String departamento, List<Desarrollador> equipo) {
        super(nombre, id, salario, departamento);
        this.equipo = equipo;
    }

    public boolean tieneEquipoValido() {
        return equipo != null && equipo.size() >= 3; // Un gerente debe tener al menos 3 desarrolladores en su equipo
    }
}