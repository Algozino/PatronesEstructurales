package Facade;

class CarritoItem {
    private final Producto producto;
    private int cantidad;

    public CarritoItem(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = Math.max(1, cantidad);
    }

    public Producto getProduct() { return producto; }
    public int getCantidad() { return cantidad; }
    public void incrementarCantidad(int delta) { this.cantidad = Math.max(1, this.cantidad + delta); }

    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}
