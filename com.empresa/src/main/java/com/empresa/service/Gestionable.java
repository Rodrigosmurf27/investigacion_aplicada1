package com.empresa.service;

import com.empresa.model.Empleado;

public interface Gestionable {
    void contratar(Empleado e);

    void despedir(Empleado e);

    void procesarPago(Empleado e);
}