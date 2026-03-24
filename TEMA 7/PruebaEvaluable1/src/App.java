import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("origen.txt")); /* Metemos el FileReader dentro */
                BufferedWriter bw = new BufferedWriter(new FileWriter("destino.txt"));) {
            String dato;
            while ((dato = br.readLine()) != null)
                bw.write(dato);
            bw.newLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
