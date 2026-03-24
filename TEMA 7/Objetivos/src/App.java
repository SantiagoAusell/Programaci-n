import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        // Usamos un try-with-resources para que Java cierre los archivos solitos al terminar.
        // Es como decirle a Java: "Abre esto, y cuando acabes, no te olvides de cerrarlo".
        try (FileReader fr = new FileReader("objetivos.txt"); // Abrimos el archivo como quien abre un libro.
                BufferedReader br = new BufferedReader(fr);) { // Ponemos a un 'lector' listo para leer líneas completas.
            
            String datos; // Aquí guardaremos cada "frase" o línea que leamos del libro.

            // El bucle "while" dice: "Mientras haya algo que leer en el libro..."
            while ((datos = br.readLine()) != null) { 
                // IMPORTANTÍSIMO: 'datos' es texto (una String). No puedes multiplicar letras por números.
                // Así que usamos Double.valueOf(datos) para convertir ese texto en un número de verdad.
                
                // Una vez que es un número (Double), ¡ya podemos hacer mates!
                // Aquí multiplicamos el valor leído por 0.08 (que sería como calcular el 8%).
                System.out.println(Double.valueOf(datos) * 0.08);
            }
        } catch (Exception e) {
            // Si algo sale mal (por ejemplo, si el archivo no existe), esto nos avisa.
            System.err.println("¡Uy! Algo se rompió: " + e.getMessage());
        }
    }
}
