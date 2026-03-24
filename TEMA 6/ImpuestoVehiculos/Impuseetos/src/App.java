import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        double total = 0;
        lista.add(new Electrico(15000));
        lista.add(new Combustión(2000));

        for (Vehiculo v : lista) {
            System.out.println(v.impuesto());
            total = total + v.impuesto();
        }
        System.out.println("El total de impuestos es: " + total + " euros");
    }
}
