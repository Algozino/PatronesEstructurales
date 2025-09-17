package Facade;

import java.util.ArrayList;
import java.util.List;

class Carrito {
    private final List<CarritoItem> items = new ArrayList<>();

    public void agregarProducto(Producto p, int cantidad) {
        if (cantidad <= 0) cantidad = 1;
        for (CarritoItem it : items) {
            if (it.getProduct().getNombre().equals(p.getNombre())) {
                it.incrementarCantidad(cantidad);
                System.out.println("[Carrito] Incrementada cantidad de " + p.getNombre() + " en " + cantidad + " unidades.");
                return;
            }
        }
        items.add(new CarritoItem(p, cantidad));
        System.out.println("[Carrito] Agregado: " + p + " x" + cantidad);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (CarritoItem it : items) total += it.getSubtotal();
        return total;
    }

    public void vaciar() {
        items.clear();
        System.out.println("[Carrito] Vacío.");
    }

    public void mostrarContenido() {
        System.out.println("[Carrito] Contenido:");
        if (items.isEmpty()) {
            System.out.println(" (vacío)");
            return;
        }
        for (CarritoItem it : items) {
            System.out.println(String.format(" - %s x%d | unit: $%.2f | subtotal: $%.2f",
                    it.getProduct().getNombre(), it.getCantidad(), it.getProduct().getPrecio(), it.getSubtotal()));
        }
        double total = calcularTotal();
        System.out.println(String.format("[Carrito] Precio final (total): $%.2f", total));
    }
}
