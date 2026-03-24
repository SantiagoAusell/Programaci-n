import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            (FileWriter fw = new FileWriter("empleados.txt", true);
            BufferedWriter bw = new BufferedWriter(bw);)

            Do{
            System.out.println("¿Qué empleado quieres añadir?");
            String dato = sc.nextLine();
            while (dato != "salir") {
                
                bw.write(dato);
                
            }}
        } catch (Exception e) {
        } finally {
            try {
                fw.close();
                sc.close();
                bw.close();
            } catch (Exception e) {

            }
        }
    }
}
