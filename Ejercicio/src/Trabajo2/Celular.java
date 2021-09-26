package Trabajo2;

public class Celular {
    private String nombre;
    private String color;
    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public void llamar(){
        System.out.println("Llamando a: "+getNombre() + " Color "+getColor());

    }
    public String getNombre(){
        return nombre;}
    public void setNombre (String nombre){
        this.nombre = nombre;}
    public String getColor(){
        return color;}
    public void setColor (String color){
        this.color = color;
    }
}
