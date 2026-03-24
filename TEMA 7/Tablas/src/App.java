import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("tabla.txt");
                BufferedWriter bw = new BufferedWriter(fw);) {
            for (int i = 0; i <= 10; i++) {
                int result = 7 * i;
                bw.write(String.valueOf("7" + "x" + i + "=" + result));
                bw.newLine();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
