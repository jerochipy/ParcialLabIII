package models;

public abstract class Producto {
    private Integer stock;
    private String nombre;
    private Double precio;

    public Producto(Integer stock, String nombre, Double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public Double aumentarPrecio(Double porcentajeAum){
        Double nuevoPrecio= (double)Math.round(getPrecio() * (1 + porcentajeAum / 100));
        setPrecio(nuevoPrecio);
        return getPrecio();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
