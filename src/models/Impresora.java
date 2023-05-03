package models;

public class Impresora extends ProdInformatico implements Ofertas{
    private Integer imprPorMin;


    public Impresora(Integer stock, String nombre, Double precio, String fabricante,Integer imprPorMin) {
        super(stock, nombre, precio, fabricante);
        this.imprPorMin=imprPorMin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "imprPorMin=" + imprPorMin +
                '}';
    }

    @Override
    public Double descuento(Double porcentajeDesc) {
        return this.getPrecio()-(this.getPrecio()*porcentajeDesc/100);
    }
}
