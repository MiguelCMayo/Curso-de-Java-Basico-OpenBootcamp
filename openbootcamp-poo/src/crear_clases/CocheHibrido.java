package crear_clases;

public class CocheHibrido extends Coche{

    String motorHibrido;

    public CocheHibrido(){

    }

    public CocheHibrido(String motorHibrido){
        this.motorHibrido = motorHibrido;
    }

    public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo, String motorHibrido){
        super(color, fabricante, modelo, peso, largo);
        this.motorHibrido = motorHibrido;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 3;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
