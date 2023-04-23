package listas;

import crear_clases.Coche;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

    public static void main(String[] args) {

        ArrayList<String> nombre = new ArrayList<>();

        nombre.add("nombre 1");
        nombre.add("nombre 2");
        nombre.add("nombre 3");
        nombre.add("nombre 4");

        System.out.println(nombre);

        for(String nombres : nombre) {
            System.out.println(nombres);
        }


        ArrayList<Coche2> coche = new ArrayList<>();

        coche.add(new Coche2("honda"));
        coche.add(new Coche2("Renault"));
        coche.add(new Coche2("Audi"));

        System.out.println(coche);

        for(Coche2 coches : coche) {
            System.out.println(coches);
        }

        //CONVERTIR UN ARRAYLIST EN UN ARRAY

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Invierno");
        arrayList.add("Primavera");
        arrayList.add("Verano");
        arrayList.add("Otoño");

        String array[] = new String [arrayList.size()];

        for(int i=0; i<arrayList.size(); i++){
            array[i] = arrayList.get(i);
            System.out.println(array[i]);
        }

        for (String elemento : array){
            System.out.println(elemento);

        }



    }
}
