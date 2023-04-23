package interfaces.conInterfaces;

import interfaces.sinInterfaces.Empleados;

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.save(new Empleados());
        empleadoCRUD.findAll();

    }
}
