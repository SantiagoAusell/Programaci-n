public class Electrico extends Vehiculo {

    public Electrico(double precio) {
        this.precio = precio;
    }

    @Override
    public double Impuesto() {
        return precio + precio * 0.9;
    }

}
