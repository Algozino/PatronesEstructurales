package Facade;

public class Main {
    public static void main(String[] args) {
        Facade tienda = new Facade();

        Producto camiseta = new Producto("Papitas", 1200.0);
        Producto pantalon = new Producto("Salchichas", 2500.0);
        Producto gorra = new Producto("Pan pancho", 600.0);

        tienda.agregarAlCarrito(camiseta, 1);
        tienda.agregarAlCarrito(pantalon, 2);
        tienda.agregarAlCarrito(gorra, 2);

        tienda.mostrarCarrito();

        boolean exito = tienda.comprar("Tarjeta de crédito", "Calle Siempre viva 742, Springfield");

        System.out.println(exito ? "Compra finalizada correctamente." : "La compra falló.");
    }
}