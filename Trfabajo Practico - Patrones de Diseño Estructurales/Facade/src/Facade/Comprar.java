package Facade;

class Comprar {
    private Carrito carrito;
    private Envio envio;
    private Pago pago;

    public Comprar(Carrito carrito, Envio envio, Pago pago) {
        this.carrito = carrito;
        this.envio = envio;
        this.pago = pago;
    }

    public void CarritoInicio() {
        System.out.println("Bienvenido a la tienda");
        carrito.Inicio();
        envio.Inicio();
        pago.Inicio();
    }

    public void CarritoFin() {
        System.out.println("Finalizando compra...");
        pago.Fin();
        envio.Fin();
        carrito.Fin();
    }

    public void CarritoCarga(String articulo, int precio) {
        carrito.Carga(articulo);
        pago.setPrecio(String.valueOf(precio));
    }
}
