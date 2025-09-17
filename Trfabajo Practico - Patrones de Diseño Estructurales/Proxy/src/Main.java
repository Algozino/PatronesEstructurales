//Con este patron buscamos controlar el acceso al objeto original, en este caso, realizamos
//un sistema de acceso a archivos restringidos que solo ciertos usuarios pueden interactuar,
//Juan tiene permiso para abrir secret.txt pero Pedro no

public class Main {
    public static void main(String[] args) {
        Usuario juan = new Usuario("Juancito");
        juan.agregarPermiso("secret.txt");    // Juan puede abrir archivos ocultos
        juan.agregarPermiso("publico.txt");   // y públicos

        Usuario pedro = new Usuario("Pedrito"); // Pedro no tiene permisos para archivos ocultos
        pedro.agregarPermiso("publico.txt");

        Archivo proxyJuan = new ArchivoProxy("secret.txt", juan);
        Archivo proxyPedro = new ArchivoProxy("secret.txt", pedro);

        System.out.println("Intento de Juan:");
        proxyJuan.abrir();
        proxyJuan.leer();  // ya cargado, solo lee

        System.out.println("\nIntento de Pedro:");
        proxyPedro.abrir(); // acceso denegado
        proxyPedro.leer();  // acceso denegado

        // Demostración de archivo público
        Archivo proxyPublico1 = new ArchivoProxy("publico.txt", juan);
        Archivo proxyPublico2 = new ArchivoProxy("publico.txt", pedro);
        System.out.println("\nJuan intenta abrir archivo público");
        proxyPublico1.abrir(); // Juan tiene permiso
        System.out.println("\nPedro intenta abrir archivo público");
        proxyPublico2.abrir(); // y Pedro también
    }
}
