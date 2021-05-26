import java.util.Scanner;
public class Ejercicio11 {
    //Ejercicio4.1
    static Scanner teclado=new Scanner(System.in);
    public static void Sueldodeanhoaumentado() {
        //Variables
        int años=1;
        double sueldo, sumaSueldo=0.0;
        //Datos de Entrada
        System.out.println("Ingrese porfavor su sueldo: ");
        sueldo=teclado.nextDouble();
        //Proceso
        while (años<=6) {
            sumaSueldo=(sumaSueldo*0.10)+sueldo;
            sueldo=sumaSueldo;
            System.out.println("Su sueldo del año "+años+":"+sumaSueldo);
            años++;
        }
        //Salida
        System.out.println("Su sueldo al cabo de los 6 años es:"+sumaSueldo);
    }
    public static void main(String[] args){
        Sueldodeanhoaumentado();
    }
}
