
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauessa
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            menu();
            opc=teclado.nextInt();
            

        } while (opc != 3);

    }

    private static void menu() {
        System.out.println("1.Gestión de funciones\n"
                + "2.Gestión de reservas\n"
                + "3.Salir\n"
                + "--Introduce opcion--");

    }

}
