package models;

public abstract class Mueble extends Producto{
    public Mueble(Integer stock, String nombre, Double precio) {
        super(stock, nombre, precio);
    }

    public Mueble() {
    }

    @Override
    public String toString() {
        return "Mueble{}";
    }
}
