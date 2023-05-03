package models;

public abstract class ProdInformatico extends Producto{
    private String fabricante;

    public ProdInformatico(Integer stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProdInformatico{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }
}
