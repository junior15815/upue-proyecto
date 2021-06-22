package Experimento;
import java.util.Scanner;
public class Trabajo3 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio03(){
        //Tabla de multiplicacion
        int total0=0, resolucion=10, resolucion2=20;
        for(int numero = 1; numero <=resolucion2; numero++){
            for(int i = 1; i <=resolucion; i++){
                total0=i*numero;
                System.out.println(""+numero+"x"+i+"= "+total0);
            }
        }
    }
    public static void main(String[] args){
        ejercicio03();
    }
}