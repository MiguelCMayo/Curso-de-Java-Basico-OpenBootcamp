package crear_clases;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 = new CocheHibrido();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        //POLIMORFISMO

        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche) {
            System.out.println("Coche");
        }
        if (coche4 instanceof CocheElectrico) {
            System.out.println("Coche electrico");
        }
        if (coche4 instanceof CocheHibrido) {
            System.out.println("Coche hibrido");
        }
    }
}
