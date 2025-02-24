package com.empresa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Desarrollador extends Empleado {
    private String proyectoAsignado;
}