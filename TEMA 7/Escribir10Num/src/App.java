import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("numbers.txt"); /* Con esta forma del try_with_resources */
                BufferedWriter bw = new BufferedWriter(fw);) {/* evita cerrar el archivo */
            for (int i = 1; i <= 10; i++) {
                bw.write(String.valueOf(i));/* El String.valeuOf cambia el valor de int a String */
                /*
                 * bw.newLine(); Esto es un metodo para que los vaya separando linea por linea
                 */
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
