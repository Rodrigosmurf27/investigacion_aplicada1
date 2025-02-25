package com.empresa.modelo;

//herencia de la super clase Empleado
public class Desarrollador extends Empleado {
    private String proyectoAsignado;

    public Desarrollador(String nombre, int id, double salario, String departamento, String proyectoAsignado) {
        super(nombre, id, salario, departamento);
        this.proyectoAsignado = proyectoAsignado;
    }

    public String getProyectoAsignado() {
        return proyectoAsignado;
    }
}
