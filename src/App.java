import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamano = 0;
        do {
            try {
                System.out.println("Introduce el numero de animgos que viene a la fiesta: ");
                tamano = teclado.nextInt();

            } catch (InputMismatchException e) {
            } finally {
                teclado.nextLine(); 
            }

        } while (tamano < 1 || tamano > 6);

        Amigo[] listado = new Amigo[tamano];

        System.out.println("***Introducción de datos***");

        for (int i = 0; i < listado.length; i++) {

            listado[i] = new Amigo();
            System.out.println("Amigo " + (i + 1));

            System.out.print("    -> Nombre: ");
            listado[i].setNombre(teclado.nextLine());
            System.out.print("    ->  Telefono: ");
            listado[i].setTelefono(teclado.nextLine());
            System.out.print("    -> Asistencia: ");
            listado[i].setAsistencia(teclado.nextBoolean());
            teclado.nextLine();

        }

        System.out.println();
        System.out.println("***Listado de nombres***");
        for (int i = 0; i < listado.length; i++) {
            System.out.print(i + 1 + "-> ");
            System.out.println(listado[i].toString());
        }

        teclado.close();
    }
}
