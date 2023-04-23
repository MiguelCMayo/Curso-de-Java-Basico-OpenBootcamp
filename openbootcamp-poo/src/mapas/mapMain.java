package mapas;

import java.util.HashMap;

public class mapMain {

    public static void main(String[] args) {

        HashMap<String,String> personas = new HashMap<>();

        personas.put("87655356k", "nombre apellido 1");
        personas.put("87655356t", "nombre apellido 2");
        personas.put("87655356p", "nombre apellido 3");
        personas.replace("87655356t", "nombre apellido 2 reemplazada");
        //personas.remove("87655356p", "nombre apellido 3");

        System.out.println(personas);


        //IMPRIME LAS CLAVES DEL MAPA
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        //IMPRIME LOS VALORES DEL MAPA
        for(String value : personas.values()){
            System.out.println(value);
        }

        //IMPRIME LOS VALORES Y LAS CLAVES DEL MAPA
        for(HashMap.Entry <String,String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }



    }
}
