package interfaces.sinInterfaces;

import interfaces.sinInterfaces.Empleados;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public class EmpleadosCRUD {

    List<Empleados> empleado = new ArrayList<>();

    public void save(Empleados nuevoempleado){

        empleado.add(nuevoempleado);
    }

    public List<Empleados> findAll(){
        return empleado;
    }
}
