package interfaces.sinInterfaces;

import interfaces.sinInterfaces.Empleados;
import interfaces.sinInterfaces.EmpleadosCRUD;

import java.util.List;

public class EmpleadosMain {

    public static void main(String[] args) {

        EmpleadosCRUD empleadosCRUD = new EmpleadosCRUD();

        Empleados juanito = new Empleados("Juanito", 30, 40000,true);
        Empleados maria = new Empleados("Maria", 30, 40000,true);
        Empleados miguel = new Empleados("Miguel", 30, 40000,true);

        empleadosCRUD.save(juanito);
        empleadosCRUD.save(maria);
        empleadosCRUD.save(miguel);

        List<Empleados> empleado = empleadosCRUD.findAll();
        System.out.println(empleado);



    }
}
