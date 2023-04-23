package interfaces.sinInterfaces;

public class Empleados {

    String nombre;
    int edad;
    double salario;
    boolean alta;

    public Empleados(){}

    public Empleados(String nombre, int edad, double salario,boolean alta) {
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
        this.alta=alta;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
