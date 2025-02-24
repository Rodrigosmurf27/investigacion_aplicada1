package com.empresa.department;

import com.empresa.model.Empleado;
import com.empresa.model.Gerente;
import com.empresa.model.Empresa;
import com.empresa.service.Gestionable;

public class RecursosHumanos extends Departamento implements Gestionable {
    private Empresa empresa;
    private Finanzas finanzas; // Dependencia de Finanzas

    public RecursosHumanos(Empresa empresa, Finanzas finanzas) {
        this.empresa = empresa;
        this.finanzas = finanzas;
    }

    @Override
    public void contratar(Empleado e) {
        if (empresa.calcularPresupuesto() >= e.getSalario()) {
            empresa.agregarEmpleado(e);
            empresa.setPresupuesto(empresa.calcularPresupuesto() - e.getSalario());
            System.out.println("Empleado contratado: " + e.getNombre());

            // Notificar a Finanzas
            finanzas.procesarPago(e);
            System.out.println("Finanzas ha sido notificado sobre la contratación de " + e.getNombre()); // Mensaje de notificación
        } else {
            System.out.println("No hay presupuesto para contratar a " + e.getNombre());
        }
    }

    @Override
    public void despedir(Empleado e) {
        if (e instanceof Gerente) {
            Gerente gerente = (Gerente) e;
            if (!gerente.tieneEquipoValido()) {
                System.out.println("No se puede despedir a un gerente con un equipo inválido (menos de 3 desarrolladores).");
                return; // No despide al gerente si no tiene un equipo válido
            }
        }

        empresa.removerEmpleado(e);
        empresa.setPresupuesto(empresa.calcularPresupuesto() + e.getSalario());
        System.out.println("Empleado despedido: " + e.getNombre());
    }

    @Override
    public void procesarPago(Empleado e) {
        // Recursos Humanos no procesa pagos
    }

    @Override
    public double calcularPresupuesto() {
        return empresa.calcularPresupuesto();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empresa.agregarEmpleado(empleado);
    }

    @Override
    public void removerEmpleado(Empleado empleado) {
        empresa.removerEmpleado(empleado);
    }
}