package Facade;

class Pago {
    public boolean procesarPago(double monto, String metodo) {
        System.out.println("[Pago] Procesando pago de $" + String.format("%.2f", monto) + " usando: " + metodo + "...");
        boolean aprobado = monto >= 0;
        System.out.println(aprobado ? "[Pago] Aprobado." : "[Pago] Rechazado.");
        return aprobado;
    }
}
