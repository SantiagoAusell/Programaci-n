public class Combustion extends Vehiculo {

    public Combustion(double CC) {
        this.CC = CC;
    }

    @Override
    public double Impuesto() {
        return CC * 3;
    }

}
