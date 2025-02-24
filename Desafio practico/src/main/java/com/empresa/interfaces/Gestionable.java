package com.empresa.interfaces;

import com.empresa.model.Empleado;

public interface Gestionable {
    void contratar(Empleado e);
    void despedir(Empleado e);
    void procesarPago(Empleado e);
}