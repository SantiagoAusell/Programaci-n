public class Combustión extends Vehiculo {
    public Combustión(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double impuesto() {
        return cilindrada = cilindrada + (cilindrada * 3);
    }
}
