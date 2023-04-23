package input_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try{
            InputStream fichero = new FileInputStream("C://Users//Miguel//Desktop//ficheroprueba.txt");

            byte[] datos = fichero.readAllBytes();

            for(byte dato : datos){
                System.out.print((char) dato);
            }
            fichero.close();

        }catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}
