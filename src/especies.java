public class especies {
public enum Tipos{
  Blanca, BoaConstrictor, Titidorado, guacamayaroja }
 private String nombre;
 private int anios;
 private String clase;
 private int precio;
 private int cantidad;
 private int ventas;


 void establecernombre(String nombre){
 this.nombre = nombre;
 }
 void estableceranios(int anios){
     this.anios= anios;
    }

    void establecerTipo(String clase){
        this.clase=clase;
    }
    void establecerTipo(int precio){
        this.precio=precio;
        }




}
