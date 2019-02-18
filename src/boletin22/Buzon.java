package boletin22;

import java.util.ArrayList;
import utilidades.PedirDatos;

public class Buzon {

    ArrayList<Correo> mensaje = new ArrayList<>();

    public Buzon() {
    }

    public int numeroDeCorreos() {
        int tamanho = mensaje.size();
        System.out.println("Número de mensajes: " + tamanho);
        return tamanho;
    }

    public void engade() {
        String contenido = PedirDatos.lerString("Escribir mensaje:");
        mensaje.add(new Correo(contenido, true));
    }

    public void porLer() {
        for (Correo c : mensaje) {
            if (c.isLido() == true) {
                System.out.println("Tiene mensajes sin leer");
                break;
            }

            if (c.isLido() == false) {
                System.out.println("No tiene mensajes nuevos");
                break;
            }
        }
    }

    public String amosaPrimerNoLeido() {
        String co = null;
        int aux = 0;
        for (Correo c : mensaje) {
            if (c.isLido() != false) {
                co = c.getContenido();
                System.out.println(co);
                c.setLido(false);
                aux = 1;
                break;
            } else {
                aux = 0;
            }
        }
        if (aux == 0) {
            System.out.println("No quedan correos por leer");
        }
        return co;
    }

    public String amosa(int k) {
        String m = mensaje.get(k).getContenido();
        System.out.println(m);
        mensaje.get(k).setLido(false);
        return m;
    }

    public void elimina(int k) {
        mensaje.remove(k - 1);
    }
}
