import java.io.DataInputStream;
import java.io.FileInputStream;

public class mostrar {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fi = new FileInputStream("pedido.dat");
                DataInputStream dis = new DataInputStream(fi);) {
            if (dis != null) {
                while (dis != null) {
                    System.out
                            .println("Has Comprado: " + dis.readUTF() + dis.readChar() + "Una Cantidad de: "
                                    + dis.readInt() + dis.readChar()
                                    + "Con un precio de: " + dis.readDouble()
                                    + dis.readChar());
                }/*readUTF es String*/
            }
        } catch (Exception e) {

        }
    }
}
