package arrays;

import java.util.Vector;

public class ArraysMain {

    public static void main(String[] args) {

        //Array unidimensional

        int array1[] = {1,7,3,9,3};

        for (int i=0; i<array1.length; i++){
            System.out.println("La posicion es: " + i + " y el valor es " + array1[i]);
        }

        for(int array : array1) {
            System.out.println(array);
        }

        //Array bidimensional

        int[][] arrayBi = {{6,7},{3,9},{2,4}};

        for(int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("La posicion es: " + i + "|" + j + " y el valor es " + arrayBi[i][j]);
            }
        }

        //Vector

        Vector<String> vector = new Vector();
        vector.add("Rojo");
        vector.add("Azul");
        vector.add("Verde");
        vector.add("Amarillo");
        vector.add("Negro");

        System.out.println(vector);

        for(String vec : vector){
            System.out.println(vec);
        }

        for (int i=0; i<vector.size(); i++){
            System.out.println("La posicion es: " + i + " y el valor es " + vector.get(i));
        }

    }
}
