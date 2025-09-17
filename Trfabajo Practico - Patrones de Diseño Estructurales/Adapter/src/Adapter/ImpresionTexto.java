package Adapter;

interface ImpresionTexto {
    void Impresion(String textType, String fileName);
}

class ImpresionPDF {
    void Imprimir(String fileName) {
        System.out.println("Leyendo archivo PDF: " + fileName);
    }
    void ImprimirDOC(String fileName) {
        System.out.println("Leyendo archivo DOC: " + fileName);
    }
}

class ImpresionAdapter implements ImpresionTexto {
    private ImpresionPDF PDF;
    public ImpresionAdapter() {
        PDF = new ImpresionPDF();
    }
    @Override
    public void Impresion(String textType, String fileName) {
        if(textType.equalsIgnoreCase("PDF")) {
            PDF.Imprimir(fileName);
        } else if(textType.equalsIgnoreCase("DOC")) {
            PDF.ImprimirDOC(fileName);
        } else {
            System.out.println("Formato no soportado: " + textType);
        }
    }
}