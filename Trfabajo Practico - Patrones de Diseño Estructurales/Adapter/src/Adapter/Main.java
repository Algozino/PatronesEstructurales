//Aqui quien realiza el trabajo de Adapter es la clase ImpresionAdapter dentro de la interface
//ImpresionTexto. Basicamente identifica que archivo se le esta pasando (.pdf, .doc o .txt) y a partir
//de eso envia la señal a la impresora con lo que deberia imprimir

package Adapter;

public class Main {
    public static void main(String[] args) {
        Impresora player = new Impresora();
        player.Impresion("TXT", "Texto bloc de notas");
        player.Impresion("PDF", "Archivo PDF");
        player.Impresion("DOC", "Archivo word");
        player.Impresion("FALSO", "Archivo falso"); // no soportado
    }
}
