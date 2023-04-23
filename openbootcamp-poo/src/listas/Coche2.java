package listas;

public class Coche2 {

    String name = "nombre de coche";

    public Coche2() { }

    public Coche2(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche2{" +
                "name='" + name + '\'' +
                '}';
    }
}
