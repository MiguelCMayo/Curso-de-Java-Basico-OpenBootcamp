package ejercicio_tema4;

public class SmartDevice {

    String fabricante;
    String color;
    Double peso;
    Double altura;
    Double ancho;

    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String color, Double peso, Double altura, Double ancho){

        this.fabricante = fabricante;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", ancho=" + ancho +
                '}';
    }
}
