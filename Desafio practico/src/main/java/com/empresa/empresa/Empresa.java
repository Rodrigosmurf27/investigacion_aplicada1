package com.empresa.empresa;

import com.empresa.departamento.Departamento;
import lombok.Data;

import java.util.List;

@Data
public class Empresa {
    private List<Departamento> departamentos;
    private List<String> historialEventos;
}