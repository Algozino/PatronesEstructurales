class ArbolConcreto implements Arbol {
    private String tipo;
    private String textura;
    private String color;
    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando objeto para el árbol: " + tipo);
    }
    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol " + tipo + " en posición (" + x + "," + y + ")");
    }
}

