import java.util.Scanner;
public class Ejercicio15 {
    static Scanner teclado=new Scanner(System.in);
    public static void Cuentadeahorros() {
        //Ejercicio4.18
        int añoinicio, añofinal;
        double inversion, total=0;
        System.out.println("Ingrese el monto de ahorro: ");
        inversion=teclado.nextDouble();
        System.out.println("Ingrese porfavor el año en el que se invirtio: ");
        añoinicio=teclado.nextInt();
        System.out.println("Ingrese porfavor el año final: ");
        añofinal=teclado.nextInt();
        for (int numero=0; numero<=añofinal-añoinicio; numero++){
            total=(total*0.15)+inversion;
            inversion=total;
            System.out.println("Su total en el año "+numero+"es de: "+total);
        }
    }
    public static void main(String[] args) {
        Cuentadeahorros();
    }
}
