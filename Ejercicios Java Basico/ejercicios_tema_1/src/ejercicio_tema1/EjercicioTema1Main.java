package ejercicio_tema1;

public class EjercicioTema1Main {

    public static void main(String[] args) {

        int numero1 = 20;
        long numero2 = 2500800333888l;
        byte numero3 = 1;
        short numero4 = 2;

        float numero5 = 3.5f;
        double numero6 = 2.5;

        char letra = 'k';

        String frase = "Ejercicio tema 1";

        boolean bool = false;

        Integer numero7 = null;
        Long numero8 = null;


        System.out.println("Estos son numeros enteros:\n" + numero1 + "\n" + numero2 + "\n" + numero3 + "\n" + numero4 + "\n" + "\n" +
                            "Estos son numeros con punto flotante:\n" + numero5 + "\n" + numero6 + "\n" + "\n" +
                            "Esto es un char: \n" + letra + "\n" + "\n" + "Esto es una cadena de texto: \n" + frase + "\n" + "\n" +
                            "Esto es un booleano: \n" + bool + "\n" + "\n" + "Estos son de tipo envoltorio: \n" + numero7 + "\n" + numero8);



    }
}
