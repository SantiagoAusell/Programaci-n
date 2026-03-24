import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        File file;
        try {

            file = new File("colores.txt");/* Crea un objeto con el archivo que hemos creado */
            sc = new Scanner(file); /*
                                     * Crea un objeto de la clase Scanner con el objeto File para poder leer o
                                     * escribir
                                     */
            while (sc.hasNextLine()) {/*
                                       * Comprueba cada línea, sirve mediante boolean para leer cada linea de texto,
                                       * con el has comprueba
                                       */
                String texto = sc.next();/* Lee la palabra del archivo y la guarda en la variable texto */
                System.out.println("Palabra: " + texto);/* Muestra la palabra guardada */
                while (sc.hasNextInt()) {/*
                                          * Comprueba cada línea, y mediante boolean comprueba cada linea para saber si
                                          * hay un número
                                          */
                    int num = sc.nextInt();/*
                                            * Aquí declara la variable num y luego guarda cada numero en la variable num
                                            */
                    System.out.println("Número: " + num);/* Muestra los números guardados */
                }
            }

        } catch (

        Exception e) {
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
