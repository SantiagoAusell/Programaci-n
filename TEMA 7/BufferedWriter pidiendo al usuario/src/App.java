import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FileWriter fw;
        BufferedWriter bw = null;
        Scanner sc = new Scanner(System.in);

        try {
            fw = new FileWriter("Escritura.txt", true);
            bw = new BufferedWriter(fw);
            System.out.println("Introduce lo que quieras añadir: ");
            String Datos = sc.nextLine();/* Guarda lo que se le meta al String */
            bw.write(Datos);/* Metodo que se usa para escribir los datos */

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
            } catch (Exception e) {

            }
        }
    }
}
