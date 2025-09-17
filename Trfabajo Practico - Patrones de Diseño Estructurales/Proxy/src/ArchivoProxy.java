class ArchivoProxy implements Archivo {
    private final String nombreArchivo;
    private Usuario usuario;
    private ArchivoReal archivoReal; // se crea sólo si el usuario tiene permiso

    public ArchivoProxy(String nombreArchivo, Usuario usuario) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (!usuario.tienePermiso(nombreArchivo)) {
            System.out.println("Acceso denegado: el usuario " + usuario.getNombre() + " NO tiene permiso para abrir " + nombreArchivo);
            return;
        }
        if (archivoReal == null) {
            archivoReal = new ArchivoReal(nombreArchivo); // carga pesada solo la primera vez
        }
        archivoReal.abrir();
    }

    @Override
    public void leer() {
        if (!usuario.tienePermiso(nombreArchivo)) {
            System.out.println("Acceso denegado: el usuario " + usuario.getNombre() + " NO tiene permiso para leer " + nombreArchivo);
            return;
        }
        if (archivoReal == null) {
            archivoReal = new ArchivoReal(nombreArchivo);
        }
        archivoReal.leer();
    }
}

