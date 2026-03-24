import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        try {/* No tiene porque ejecutarse siempre */
            FileReader fr = new FileReader("Buffered.txt");
            br = new BufferedReader(fr);/* Encapsulamos el FileReader en el Buffered */
            String dato;/*
                         * Se utiliza String debido a que lee las líneas, no como en file
                         * que lee por codigo ASCII
                         */
            while ((dato = br.readLine()) != null) {
                System.out.println(dato);
            }
        } catch (IOException e) {/* No tiene porque ejecutarse siempre */
            System.err.println("Ha ocurrido un error al leer del archivo.");
        } catch (Exception e) {/* El orden importa */
            System.err.println("Ha ocurrido un error.");
        } finally {/* Siempre se ejecuta */
            try {
                br.close();
            } catch (Exception e) {
                System.err.println("Ha ocurrido un error.");
            }
        }
    }
}
