package crear_clases;

public class CocheMain {

    public static void main(String[] args) {

        Coche cocheObj1 = new CocheElectrico("rojo", "honda", "civic", 1430.45, 5.4,"motor x");

        cocheObj1.acelerar(50);

        System.out.println(cocheObj1);

        CocheElectrico cocheElectrico1 = new CocheElectrico();

        cocheElectrico1.motorElectrico="Ejemplo motor";
        cocheElectrico1.color="Verde";
        cocheElectrico1.fabricante="Honda";
        cocheElectrico1.modelo="Civic";

        System.out.println(cocheElectrico1);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","alfa","romeo",2000.0,4.99,"TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }
}
