package boletin22;

public class Correo {

    private String contenido;
    private boolean lido;

    public Correo() {
    }

    public Correo(String contenido, boolean lido) {
        this.contenido = contenido;
        this.lido = lido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contenido=" + contenido + ", lido=" + lido + '}';
    }
}
