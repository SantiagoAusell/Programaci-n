import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaramos las variables fuera del try para poder cerrarlas en el finally
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            // Bucle externo: genera las tablas del 1 al 10
            for (int i = 1; i <= 10; i++) {

                // Creamos un archivo para cada tabla (tabla1.txt, tabla2.txt, ...)
                fw = new FileWriter("tabla" + i + ".txt");

                // Envolvemos el FileWriter en un BufferedWriter para mejorar el rendimiento
                bw = new BufferedWriter(fw);

                // Bucle interno: escribe cada multiplicación de la tabla (del 0 al 10)
                for (int j = 0; j <= 10; j++) {
                    // Escribimos cada línea con el formato "i x j = resultado"
                    bw.write(i + " x " + j + " = " + (i * j) + "\n");
                    // flush() fuerza a que los datos del buffer se escriban al archivo
                    bw.flush();
                }
            }
        } catch (Exception e) {
            // Captura cualquier excepción de entrada/salida (archivo no encontrado, permisos, etc.)
        } finally {
            // El bloque finally se ejecuta siempre, haya o no excepción
            try {
                fw.close(); // Cerramos el FileWriter para liberar el recurso del archivo
                bw.close(); // Cerramos el BufferedWriter (internamente también hace flush)
            } catch (Exception e) {
                // Captura posibles excepciones al cerrar los flujos
            }
        }
    }
    }
