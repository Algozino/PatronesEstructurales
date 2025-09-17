package Adapter;

public class Impresora implements ImpresionTexto {
    private ImpresionAdapter textAdapter;
    @Override
    public void Impresion(String textType, String fileName) {
        if(textType.equalsIgnoreCase("TXT")) {
            System.out.println("Leyendo archivo TXT: " + fileName);
        } else {
            textAdapter = new ImpresionAdapter();
            textAdapter.Impresion(textType, fileName);
        }
    }
}
