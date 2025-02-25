package com.empresa.modelo;

import lombok.Data;

//superclase
@Data
public abstract class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;
    private boolean activo;

    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
        this.activo = true;
    }

}
