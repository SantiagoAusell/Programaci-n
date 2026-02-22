import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        double total = 0;

        Vehiculo e1 = new Electrico(10000);
        Vehiculo e46 = new Combustión(2200);
        lista.add(e1);
        lista.add(e46);

        for (Vehiculo i : lista) {
            total = total + i.Impuesto();
            System.out.println(i.Impuesto());
            System.out.println(i);
        }

        System.out.println("El impuesto total es: " + total);
    }
}
