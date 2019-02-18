package boletin22;

import javax.swing.JOptionPane;
import utilidades.PedirDatos;

public class Boletin22 {

    public static void main(String[] args) {
        Buzon msg = new Buzon();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "**********MENÚ**********\n"
                    + "Introduce una opción:\n"
                    + "1.- Escribir nuevo correo\n"
                    + "2.- Ver número de correos\n"
                    + "3.- Mostrar correo concreto\n"
                    + "4.- Mostrar primer correo sin leer\n"
                    + "5.- Ver si hay correos no leídos\n"
                    + "6.- Borrar correos\n"));

            switch (opcion) {
                case 1:
                    msg.engade();
                    break;
                case 2:
                    msg.numeroDeCorreos();
                    break;
                case 3:
                    int k = PedirDatos.enteiro("Introducir posicion del correo");
                    msg.amosa(k - 1);
                    break;
                case 4:
                    msg.amosaPrimerNoLeido();
                    break;
                case 5:
                    msg.porLer();
                    break;
                case 6:
                    k = PedirDatos.enteiro("Introducir posicion del correo");
                    msg.elimina(k);
                    break;
            }
        } while (opcion != 0);
    }
}
