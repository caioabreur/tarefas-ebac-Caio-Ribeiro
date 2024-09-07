public class Computador {

    // Características do computador
    private String marca;
    private String processador;
    private String placaDeVideo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    // Métodos do computador
    public void ligarPc() {
        System.out.println("Ligando o computador");
    }

    public void desligarPc() {
        System.out.println("Desligando o computador");
    }

    public void reiniciarPc() {
        System.out.println("Reiniciando o computador");
    }
}
