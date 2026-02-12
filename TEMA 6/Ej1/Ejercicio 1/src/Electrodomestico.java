public class Electrodomestico {

    protected String marca;
    protected double precio;
    protected double potencia;

    public Electrodomestico(String marca, double precio, double potencia) {
        this.marca = marca;
        this.precio = precio;
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsumo(int horas) {
        return potencia * horas;
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }
}
