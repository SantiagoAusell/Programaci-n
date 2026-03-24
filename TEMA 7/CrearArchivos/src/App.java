import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            for (int i = 1; i <= 10; i++) {
                fw = new FileWriter("tabla" + i + ".txt");
                bw = new BufferedWriter(fw);
                for (int j = 0; j <= 10; j++) {
                    bw.write(String.valueOf(i + "x" + j + "=" + i * j));
                    bw.newLine();
                }
                bw.flush();/* Hace que todo lo que se almacena en el buffer se guarde en el archivo */
                fw.close();/* Antes de pasar al siguiente */
                bw.close();
            }
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
