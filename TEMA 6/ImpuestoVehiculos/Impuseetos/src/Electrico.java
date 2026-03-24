public class Electrico extends Vehiculo {
    public Electrico(double precio) {
        this.precio = precio;
    }

    @Override
    public double impuesto() {
        return precio = precio + (precio * 0.09);
    }
}
