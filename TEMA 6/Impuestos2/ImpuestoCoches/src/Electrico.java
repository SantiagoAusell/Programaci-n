public class Electrico extends Vehiculo {
    public Electrico(double precio) {
        this.precio = precio;
    }

    public double Impuesto() {
        return precio = precio + (precio * 0.09);
    }

    @Override
    public String toString() {
        return "probandoooo";
    }

}
