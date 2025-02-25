package com.empresa.service;

import com.empresa.modelo.Empleado;

public interface Gestionable {
    void contratar(Empleado e);

    void despedir(Empleado e);

    void procesarPago(Empleado e);
}