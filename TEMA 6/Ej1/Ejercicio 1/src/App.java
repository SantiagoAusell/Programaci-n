import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scTexto = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);

        ArrayList<Electrodomestico> lista = new ArrayList();

        int opc;

        do {
            mostrarMenu();
            opc = sc.nextInt();
            switch (opc) {

                case 1: {
                    System.out.println("¿Qué marca de lavadora va a comprar? ");
                    String marca = scTexto.nextLine();
                    System.out.println("Introduce el precio: ");
                    double precio = scDouble.nextDouble();
                    Lavadora l1 = new Lavadora(marca, precio, 2000);
                    lista.add(l1);
                    break;
                }

                case 2: {
                    System.out.println("¿Qué marca de Televisor va a comprar? ");
                    String marca = scTexto.nextLine();
                    System.out.println("Introduce el precio: ");
                    double precio = scDouble.nextDouble();
                    Televisor t1 = new Televisor(65, marca, precio, 150);
                    lista.add(t1);
                    break;
                }

                case 3: {

                    double acum = 0;
                    for (Electrodomestico i : lista) {

                        acum = acum + i.getPrecio();
                    }
                    System.out.println("Total: " + acum + "€");
                }
                case 4:
                    break;
            }

        } while (opc >= 1 && opc < 4);

    }

    public static void mostrarMenu() {
        System.out.println("***********");
        System.out.println("Elige oción:");
        System.out.println("1. Comprar Lavadora");
        System.out.println("2. Comprar Televisor");
        System.out.println("3. Pagar");
        System.out.println("4. Salir");
        System.out.println("***********");
    }
}