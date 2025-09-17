package Bridge;

abstract class Medio {
    protected Notificacion notificacion;
    public Medio(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    abstract void Aplicar();
}

// Refined Abstractions
class Email extends Medio {
    public Email(Notificacion notificacion) {
        super(notificacion);
    }
    @Override
    void Aplicar() {
        System.out.println("El mensaje es un Email del tipo:  " + notificacion.aplicarTipo());
    }
}

class SMS extends Medio {
    public SMS(Notificacion notificacion) {
        super(notificacion);
    }
    @Override
    void Aplicar() {
        System.out.println("El mensaje es un SMS del tipo: " + notificacion.aplicarTipo());
    }
}
