public class especies {
public enum Categoria{
    aves ,reptiles ,mamifero

}
 private String nombre;
 private int anios;
 private String clase;
 private int precio;
 private int cantidad;
 private int ventas;



 public especies(String nombre, Categoria pCategoria,int anios,String clase,int precio,int cantidad){
 nombre = nombre;
     Categoria Categoria = pCategoria;
 anios = anios;
 clase = clase;
 precio=precio;
 cantidad=cantidad;
 ventas=0;

 }
 String devolverNombre(){
     return nombre;
 }

    int  devolveranios(){
        return anios;
    }

    String devolverClase(){
        return clase;
    }

    int devolverPrecio(){
        return precio;
    }


    int devolverCantidad(){
        return cantidad;
    }
    int devolverVentas(){
        return ventas;
    }
    Categoria darCategoria(){
        Categoria Categoria = null;
        return Categoria;
    }


}

