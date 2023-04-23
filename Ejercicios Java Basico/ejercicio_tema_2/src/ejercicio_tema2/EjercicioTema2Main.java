package ejercicio_tema2;

public class EjercicioTema2Main {

    public static void main(String[] args) {

        double precio;

        precio = getPrecioIva(500);

        System.out.println("El precio con el IVA incluido es: " + precio + " euros");

    }

    static double getPrecioIva(double precio){

        return precio * 1.21;
    }
}
