import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3
        ArrayList<Producto> list = new ArrayList<>();
        list.add(new Escritorio(10,"Escritorio Gamer",25000.0,100,320));
        list.add(new Silla(10,"Gamer RGB",5000.0,true));
        list.add(new Notebook(10,"Asus Pro",255000.0,"Asus",16));
        list.add(new Impresora(10,"HP Inkjet",25000.0,"HP",5));




        for (Producto item: list) {
            if(item instanceof Escritorio){
                System.out.println("El item: "+item.getNombre()+" es de tipo escritorio");
            }else if(item instanceof Silla){
                System.out.println("El item: "+item.getNombre()+ " es de tipo silla");
            }else if(item instanceof Notebook){
                System.out.println("El item: "+item.getNombre()+ " es de tipo notebook");
            }else if(item instanceof Impresora){
                System.out.println("El item: "+item.getNombre()+" es de tipo impresora");
            }
        }

        //Ejercicio 5
        for (Producto item: list
        ) {

            if(item instanceof Escritorio){
                System.out.println("El item: "+item.getNombre()+ " de tipo escritorio. Precio viejo: $"+
                        item.getPrecio()+" , precio nuevo= $"+item.aumentarPrecio(10.0));
            }else if(item instanceof Silla){
                System.out.println("El item: "+item.getNombre()+ "de tipo silla. Precio viejo: $"+
                        item.getPrecio()+" , precio nuevo= $"+item.aumentarPrecio(5.0));
            }else if(item instanceof Notebook){
                System.out.println("El item: "+item.getNombre()+ "de tipo notebook. Precio viejo: $"+
                        item.getPrecio()+" , precio nuevo= $"+item.aumentarPrecio(20.0));
            }else if(item instanceof Impresora){
                System.out.println("El item: "+item.getNombre()+ "de tipo impresora. Precio viejo: $"+
                        item.getPrecio()+" , precio nuevo= $"+item.aumentarPrecio(15.0));
            }

        }


    }
}