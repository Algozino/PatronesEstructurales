import java.util.HashMap;
import java.util.Map;

class FabricaDeArboles {
    private Map<Character, Arbol> letras = new HashMap<>();
    public Arbol obtenerLetraA(char a) {
        Arbol arbol1 = letras.get(a);
        if (arbol1 == null) {
            arbol1 = new ArbolConcreto("Roble", "Textura_Arbol1.png", "Marron");
            letras.put(a, arbol1);
        }
        return arbol1;
    }
    public Arbol obtenerLetraB(char b) {
        Arbol arbol2 = letras.get(b);
        if (arbol2 == null) {
            arbol2 = new ArbolConcreto("abedul", "Textura_Arbol2.png", "Blanco");
            letras.put(b, arbol2);
        }
        return arbol2;
    }
    public Arbol obtenerLetraC(char c) {
        Arbol arbol3 = letras.get(c);
        if (arbol3 == null) {
            arbol3 = new ArbolConcreto("Pino", "Textura_Arbol3.png", "Café");
            letras.put(c, arbol3);
        }
        return arbol3;
    }
}