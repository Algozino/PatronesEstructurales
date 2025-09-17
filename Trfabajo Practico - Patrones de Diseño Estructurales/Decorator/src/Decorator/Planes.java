package Decorator;

abstract class Planes implements Plan {
    protected Plan planes;

    public Planes(Plan planes) {
        this.planes = planes;
    }

    @Override
    public String getDescripcion() {
        return planes.getDescripcion();
    }

    @Override
    public double getCosto() {
        return planes.getCosto();
    }
}

// Decoradores Concretos

class HD extends Planes {
    public HD(Plan planes) {
        super(planes);
    }

    @Override
    public String getDescripcion() {
        return planes.getDescripcion() + " + HD";
    }

    @Override
    public double getCosto() {
        return planes.getCosto() + 500;
    }
}

class UltraHD extends Planes {
    public UltraHD(Plan planes) {
        super(planes);
    }

    @Override
    public String getDescripcion() {
        return planes.getDescripcion() + " + UltraHD";
    }

    @Override
    public double getCosto() {
        return planes.getCosto() + 1000;
    }
}

class Descargas extends Planes {
    public Descargas(Plan planes) {
        super(planes);
    }

    @Override
    public String getDescripcion() {
        return planes.getDescripcion() + " + Descargas Offline";
    }

    @Override
    public double getCosto() {
        return planes.getCosto() + 700;
    }
}