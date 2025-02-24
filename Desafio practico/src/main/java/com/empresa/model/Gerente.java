package com.empresa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Gerente extends Empleado {
    private List<Desarrollador> equipo;
}