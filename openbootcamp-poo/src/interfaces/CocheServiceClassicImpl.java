package interfaces;

import crear_clases.Coche;
import crear_clases.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
