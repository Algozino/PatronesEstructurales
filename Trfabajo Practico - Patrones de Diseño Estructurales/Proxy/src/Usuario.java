import java.util.HashSet;
import java.util.Set;

class Usuario {
    private final String nombre;
    private Set<String> permisos; // nombres de archivos permitidos

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.permisos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPermiso(String nombreArchivo) {
        permisos.add(nombreArchivo);
    }

    public boolean tienePermiso(String nombreArchivo) {
        return permisos.contains(nombreArchivo);
    }
}

