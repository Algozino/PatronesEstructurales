//Con este patron se busca compartir las partes comunes del estado entre varios objetos en vez
//de mantener toda la informacion en cada objeto, aplicado a este caso, en vez de que cada arbol
//sea una instancia de la clase, proponemos una estructura comun para todos los arboles, instanciamos
//unos pocos (en este caso Roble, Abedul y Pino) y luego colocamos estas instancias clonadas en partes
//especificas del mapa

public class Main {
    public static void main(String[] args) {
        FabricaDeArboles fabrica1 = new FabricaDeArboles();
        String texto1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int x1 = 0;
        for (char a : texto1.toCharArray()) {
            Arbol arbol = fabrica1.obtenerLetraA(a);
            arbol.dibujar(x1, 10);
            x1 += 10;
        }

        FabricaDeArboles fabrica2 = new FabricaDeArboles();
        String texto2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int x2 = 2;
        for (char b : texto2.toCharArray()) {
            Arbol arbol = fabrica2.obtenerLetraB(b);
            arbol.dibujar(x2, 10);
            x2 += 10;
        }

        FabricaDeArboles fabrica3 = new FabricaDeArboles();
        String texto3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int x3 = 4;
        for (char c : texto3.toCharArray()) {
            Arbol arbol = fabrica3.obtenerLetraC(c);
            arbol.dibujar(x3, 10);
            x3 += 10;
        }

        FabricaDeArboles fabrica4 = new FabricaDeArboles();
        String texto4 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int x4 = 6;
        for (char a : texto4.toCharArray()) {
            Arbol arbol = fabrica4.obtenerLetraA(a);
            arbol.dibujar(x4, 10);
            x4 += 10;
        }

        FabricaDeArboles fabrica5 = new FabricaDeArboles();
        String texto5 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int x5 = 8;
        for (char b : texto5.toCharArray()) {
            Arbol arbol = fabrica5.obtenerLetraB(b);
            arbol.dibujar(x5, 10);
            x5 += 10;
        }
    }
}
