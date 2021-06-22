package Experimento;
import java.util.Scanner;
public class Ivistueresmiproyecto {
    static Scanner teclado=new Scanner(System.in);
    public static void Trabajodeproyecto(){
        int cantidaddesocios;
        double inversion, ganancia=0, total=0;
        System.out.println("Ingrese la ganancia del mes: ");
        ganancia=teclado.nextDouble();
        System.out.println("Ingrese la cantidad de socios: ");
        cantidaddesocios=teclado.nextInt();
        for (int numero=1; numero<=cantidaddesocios; numero++){
            System.out.println("Ingrese la cantidad del socio "+numero+":");
            inversion=teclado.nextDouble();
            if (inversion<=5000) {
                total=ganancia*0.055;
            }
            if (inversion>5000 && inversion<=10000){
                total=ganancia*0.10;
            }
            System.out.println("La ganacia del socio "+numero+" es de: "+total);
        }
    }
    public static void main(String[] args){
        System.out.println("Hola, bienvenido al sistema de ganacia de la empresa tu Ivis");
        Trabajodeproyecto();
    }
}
