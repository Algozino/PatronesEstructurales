//En este patron se busca introducir una interfaz mas sencilla para que el cliente no interactue
//con clases complejas, aqui solo se muestran los articulos que el cliente compra y su precio, sin
//que el cliente opere directamente con la clase Carrito, Envio, Pago, etc
package Facade;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Envio projector = new Envio();
        Pago pago = new Pago();
        Comprar compra = new Comprar(carrito, projector, pago);
        compra.CarritoInicio();
        compra.CarritoCarga("shampoo", 500);
        compra.CarritoCarga("fideos", 100);
        compra.CarritoCarga("carne", 300);
        compra.CarritoCarga("galletitas", 1000000);
        compra.CarritoFin();
    }
}
