package funciones;

public class FuncionesMain {

    public static void main(String[] args) {

        //OPCION 1: FUNCION SIN PARAMETROS Y SIN TIPO DE RETORNO
        showMenu();

        //OPCION 2: FUNCION SIN PARAMETROS Y CON TIPO DE RETORNO
        System.out.println(getMenu());

        //OPCION 3: FUNCION CON PARAMETROS Y SIN TIPO DE RETORNO
        imprimirSaludoBuenosDias("OpenBootCamp");

        //OPCION 4: FUNCION CON PARAMETROS Y CON TIPO DE RETORNO
        String nombre = "Miguel";
        String apellido = "Castellanos";
        System.out.println(obtenerSaludo(nombre, apellido));
    }




    static void showMenu(){
        System.out.println("1 - Ensaladilla rusa");
        System.out.println("2 - Chuletas");
        System.out.println("3 - Tarta chocolate");
    }

    static String getMenu(){
        return "1 - Ensaladilla rusa" + "\n" + "2 - Chuletas" + "\n" + "3 - Tarta chocolate";
    }

    static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Buenos dias " + nombre);
    }

    private static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }
}
