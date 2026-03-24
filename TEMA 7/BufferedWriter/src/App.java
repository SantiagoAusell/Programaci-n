import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        FileWriter fw;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("Escritura.txt");
            bw = new BufferedWriter(fw);
            bw.write("Cecilia");
            bw.close();
        } catch (Exception e) {
        } finally {
        }
    }
}
