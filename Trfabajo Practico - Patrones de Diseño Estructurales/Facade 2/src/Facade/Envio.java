package Facade;

import java.util.Random;

class Envio {
    private final Random rnd = new Random();

    public void coordinarEntrega(String direccion) {
        String tracking = "TRK" + (100000 + rnd.nextInt(900000));
        System.out.println("[Envio] Entrega coordinada a: " + direccion);
        System.out.println("[Envio] Número de seguimiento: " + tracking);
    }
}

