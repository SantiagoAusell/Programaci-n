public class Lavadora extends Electrodomestico {
    boolean aguaCaliente;

    public Lavadora(String marca, double precio, double potencia) {
        super(marca, precio, potencia);
        aguaCaliente = false;
    }

    public Lavadora(boolean aguaCaliente, String marca, double precio, double potencia) {
        super(marca, precio, potencia);
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        return potencia * horas * 0.20;
    }

}
