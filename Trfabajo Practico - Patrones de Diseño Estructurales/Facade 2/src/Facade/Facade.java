package Facade;

class Facade {
    private final Carrito carrito;
    private final Pago pago;
    private final Envio envio;

    public Facade() {
        this.carrito = new Carrito();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void agregarAlCarrito(Producto producto, int cantidad) {
        carrito.agregarProducto(producto, cantidad);
    }

    public void mostrarCarrito() {
        carrito.mostrarContenido();
    }

    public boolean comprar(String metodoPago, String direccion) {
        System.out.println("--- Iniciando proceso de compra (Facade) ---");

        carrito.mostrarContenido();
        double total = carrito.calcularTotal();

        boolean pagoOk = pago.procesarPago(total, metodoPago);
        if (!pagoOk) {
            System.out.println("--- Compra cancelada por fallo en el pago ---");
            return false;
        }

        envio.coordinarEntrega(direccion);

        carrito.vaciar();

        System.out.println("--- Proceso de compra finalizado (Facade) ---");
        return true;
    }
}

