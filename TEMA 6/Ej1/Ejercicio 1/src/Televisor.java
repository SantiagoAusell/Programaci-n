public class Televisor extends Electrodomestico {
    int pulgadas;

    public Televisor(int pulgadas, String marca, double precio, double potencia) {
        super(marca, precio, potencia);
        this.pulgadas = pulgadas;
    }

}
