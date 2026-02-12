
public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private double descuento;
    private String tipoEnvase;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // Getter y Setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVolumen(double v) {
        this.volumen = v;
    }

    public double getVolumen() {
        return volumen;
    }

    // Getter y Setter para precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double des) {/* Get devuelve el descuento */
        this.descuento = des;
    }

    public double getPrecioDescuento() {
        return precio - descuento;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    public String toString() {
        return "Detergente: " + "\nmarca=" + marca + "\nprecio=" + precio + "\ndescuento" + descuento + "\nvolumen="
                + volumen + "\nTipo de envase=" + tipoEnvase;
    }
}
