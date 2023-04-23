package input_output;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerMain  {

    public static void main(String[] args) {

        boolean ok = false;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numeros");

            try{
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
            }catch (InputMismatchException e){
                System.out.println("Numeros invalidos");
            }
        }while (!ok);
    }
}
