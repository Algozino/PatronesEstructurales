package Bridge;

public interface Notificacion {
    String aplicarTipo();
}

class Alerta implements Notificacion {
    @Override
    public String aplicarTipo() {
        return "Alerta";
    }
}

class Promocion implements Notificacion {
    @Override
    public String aplicarTipo() {
        return "Promocion";
    }
}

class Recordatorio implements Notificacion {
    @Override
    public String aplicarTipo() {
        return "Recordatorio";
    }
}

