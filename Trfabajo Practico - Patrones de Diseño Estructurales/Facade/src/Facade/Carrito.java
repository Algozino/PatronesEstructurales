package Facade;

public class Carrito {
    public void Inicio() {
        System.out.println("Carrito vacio");
    }
    public void Carga(String item) {
        System.out.println("Agregando articulo: " + item);
    }
    public void Fin() {
        System.out.println("Articulos agregados al carrito");
    }
}
