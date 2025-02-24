package com.empresa.model;

import lombok.Data;

@Data
public abstract class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;

    public abstract double getSalario();
}