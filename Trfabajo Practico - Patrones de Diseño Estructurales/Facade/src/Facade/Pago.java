package Facade;

public class Pago {
    public void Inicio() {
        System.out.println("Preparando pago");
    }

    public void Fin() {
        System.out.println("Pago finalizado");
    }

    public void setPrecio(String precio) {
        System.out.println("Con un precio de: " + precio);
    }
}
