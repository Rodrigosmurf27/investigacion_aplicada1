# investigacion_aplicada1

Sistema de Gestión Empresarial Modular

Descripción del problema y solución :

Una empresa tecnológica en expansión necesita un software para administrar sus empleados en tres departamentos clave: Recursos Humanos, Finanzas y Desarrollo de Software. Cada departamento tiene funciones específicas y deben interactuar entre sí para garantizar el buen funcionamiento de la empresa. 

La empresa contrata a empleados con diferentes roles (Desarrollador, Gerente, Contador), y cada uno tiene un salario diferente. Recursos Humanos se encarga de contratar y despedir empleados, mientras que Finanzas se encarga de calcular y procesar los pagos. Cuando un empleado es contratado, Finanzas debe recibir la 
notificación para gestionar su salario.

La solución implementa un sistema modular y orientado a objetos que garantiza la correcta gestión de empleados, asegurando el cumplimiento de las reglas establecida en el negocio sin generar malos entendidos.

✅ Gestión de empleados: Cada empleado pertenece a un departamento y tiene un rol específico (Desarrollador, Gerente, Contador).
✅ Contratación y despido: Recursos Humanos gestiona la contratación y despido de empleados, notificando automáticamente a Finanzas.
✅ Control de presupuesto: Recursos Humanos solo puede contratar si hay presupuesto disponible en Finanzas.
✅ Procesamiento de pagos: Finanzas solo paga salarios a empleados activos y que cumplan las condiciones establecidas.

✅ Validaciones de negocio:
Un gerente debe tener mínimo 3 desarrolladores a su cargo.
Un desarrollador debe estar asignado a un proyecto antes de recibir salario.

● Cómo ejecutar el proyecto :

Pre-requisitos: 

Configuración del Proyecto 
✅IntelliJ IDEA 
✅ Lombok 
✅ Jacoco
✅Lenguaje: Java 17 
✅Gestor de dependencias: Maven 
✅Repositorio de código: GitHub

Conceptos aplicados: 
● Herencia 
● Polimorfismo 
● Abstracción 
● Encapsulamiento


● Breve explicación de pruebas unitarias :

Despedir Gerente: Verifica si un gerente puede ser despedido según su equipo.

Finanzas: Verifica que el metodo procesarPago() funciona correctamente según el estado del empleado.

Notificaciones: La prueba verifica que Finanzas sea notificado al contratar a un empleado. 

Recursos humanos: Verifica el comportamiento de el sistema de gestión de recursos humanos cuando no hay suficiente presupuesto.


Autores :

Manuel de Jesús Escobar Contreras---------EC230554

Alejandra Marisol Hernández Monterrosa----HM240103

José Abdiel Palacios Méndez---------------PM241596

Rodrigo Alberto Velasco Herrera-----------VH192433
