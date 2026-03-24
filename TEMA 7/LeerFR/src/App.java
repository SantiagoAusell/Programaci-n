// Importamos la herramienta necesaria para poder leer archivos de texto
import java.io.FileReader;

// Esta es la "caja" principal (clase) donde vive todo nuestro código
public class App {
    
    // Este es el "motor" (método main) que hace que el programa empiece a funcionar
    // "throws Exception" es un aviso de que pueden ocurrir errores al leer el archivo
    public static void main(String[] args) throws Exception {
        
        // Creamos una variable llamada "fr" para guardar nuestro lector de archivos.
        // Empezamos poniéndola a "null" (vacía) porque aún no hemos abierto nada.
        FileReader fr = null;
        
        try {
            // Intentamos "abrir" el archivo llamado "prueba.txt"
            // Es como abrir un libro para empezar a leer sus hojas
            fr = new FileReader("prueba.txt");
            
            // Leemos el primer carácter o letra del archivo.
            // Java nos da un número (código ASCII) en vez de la letra directamente.
            int valor = fr.read();
            
            // Mientras el número NO sea -1, significa que todavía hay letras por leer.
            // Java nos devuelve -1 cuando llega al "fin del libro".
            while (valor != -1) {
                
                /*
                 * El número 32 representa el "espacio" en blanco en el lenguaje de los ordenadores.
                 * Aquí comprobamos: "Si la letra que hemos leído NO es un espacio..."
                 */
                if (valor != 32) {
                    /*
                     * Imprimimos la letra en la pantalla.
                     * Usamos "(char) valor" para transformar el número otra vez en una letra legible.
                     * Ejemplo: el número 65 se convierte en la letra 'A'.
                     */
                    System.out.print((char) valor);
                }
                
                // Después de imprimir (o saltarnos el espacio), leemos la SIGUIENTE letra.
                // Esto hace que el bucle "while" siga avanzando letra a letra.
                valor = fr.read();
            }
            
            // Cuando terminamos de leer todo, imprimimos un salto de línea para separar el texto.
            System.out.println("");
            
        } catch (Exception e) {
            // Si el archivo no existe o hay algún fallo, el programa saltará aquí.
            // Esto evita que el programa se cierre de golpe con un error feo.
            System.out.println("¡Vaya! Ha ocurrido un error al intentar leer el archivo.");
            
        } finally {
            // El bloque "finally" se ejecuta SIEMPRE, haya habido error o no.
            // Es como un recordatorio para "limpiar" antes de irse.
            
            // Es de buena educación cerrar siempre el archivo que abrimos para no gastar memoria.
            if (fr != null) {
                fr.close(); // Cerramos el "libro"
            }
        }
    }
}
