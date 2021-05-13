import java.util.Scanner;
class Ejercicio01{
  static Scanner teclado=new Scanner(System.in);
  static void Ejercicio01JVO(){
    //Inicio
    System.out.println("Hola, bienvenido");
    // Datos de entrada
    String Alumno;
    double NotaUnidad1, NotaUnidad2, NotaUnidad3, TrabajoFinal, Resultado=0;
    System.out.println("Nombre del Alumno:");
    Alumno=teclado.nextLine();
    System.out.println("Porfavor ingrese su nota de la unidad1:");
    NotaUnidad1=teclado.nextDouble();
    System.out.println("Porfavor ingrese su nota de la unidad2:");
    NotaUnidad2=teclado.nextDouble();
    System.out.println("Porfavor ingrese su nota de la unidad3:");
    NotaUnidad3=teclado.nextDouble();
    System.out.println("Porfavor ingrese su nota del trabajofinal:");
    TrabajoFinal=teclado.nextDouble();
    //Proceso
    Resultado=(NotaUnidad1*0.20)+(NotaUnidad2*0.15)+(NotaUnidad3*0.15)+(TrabajoFinal*0.50);
    System.out.println("El promedio final del alumno:"+Alumno+"es de"+Resultado);
  }
  public static void main (String[] arg){
    Ejercicio01JVO();
  }
}