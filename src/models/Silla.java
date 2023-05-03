package models;

public class Silla extends Mueble implements Ofertas{
    private Boolean ruedas;

    public Silla(Integer stock, String nombre, Double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Silla() {
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                '}';
    }

    @Override
    public Double descuento(Double porcentajeDesc) {
        return this.getPrecio()-(this.getPrecio()*porcentajeDesc/100);
    }
}
