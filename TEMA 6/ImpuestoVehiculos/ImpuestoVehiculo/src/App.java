import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        double total = 0;

        Vehiculo tesla = new Electrico(15000);
        Vehiculo ae86 = new Combustion(1340);
        lista.add(tesla);
        lista.add(ae86);

        for (Vehiculo i : lista) {
            total = total + i.Impuesto();
            System.out.println(i);
        }

        System.out.println("El impuesto total es: " + total);
    }
}
