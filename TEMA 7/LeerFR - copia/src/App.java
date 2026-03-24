import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader fr = null;
        try {
            fr = new FileReader("prueba.txt");
            int valor;
            while ((valor= fr.read()) != -1) {/*
                                  * El -1 actua como fin de archivo, pero para eso hay que leerlo declarando
                                  * valor
                                  */
                if (valor != 32) {
                    System.out.print((char) valor);/*
                                                    * Con esto convertimos el codigo ASCII en su caracter
                                                    * correspondiente
                                                    */
                }
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error");

        } finally {
            fr.close();
        }

    }
}
