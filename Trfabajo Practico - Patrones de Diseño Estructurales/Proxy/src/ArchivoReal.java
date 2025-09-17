class ArchivoReal implements Archivo {
    private final String nombre;
    private String contenido;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando archivo desde disco: " + nombre);
        this.contenido = "Contenido seguro de " + nombre;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo archivo: " + nombre);
    }

    @Override
    public void leer() {
        System.out.println("Leyendo contenido: " + contenido);
    }
}

