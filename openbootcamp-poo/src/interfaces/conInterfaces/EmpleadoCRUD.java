package interfaces.conInterfaces;

import interfaces.sinInterfaces.Empleados;

import java.util.List;

public interface EmpleadoCRUD {

    void save(Empleados empleado);

    List<Empleados> findAll();

    void delete(Empleados empleado);
}
