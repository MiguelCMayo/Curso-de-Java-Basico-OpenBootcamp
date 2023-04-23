package tryCatch;

public class TryCatchMain {

    public static void main(String[] args) {

        try{
            int result = 5/0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("cierre de recursos");
        }

        System.out.println("Fin");
    }
}
