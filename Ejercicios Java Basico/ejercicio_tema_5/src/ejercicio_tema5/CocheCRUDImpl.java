package ejercicio_tema5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Metodo guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo mostrar todo");
    }

    @Override
    public void delete() {
        System.out.println("Metodo eliminar");
    }
}
