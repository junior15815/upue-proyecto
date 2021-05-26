import java.util.Scanner;
public class Ejercicio13 {
    //Ejercicio4.5
    static Scanner teclado=new Scanner(System.in);
    public static void Ahorrodemividad() {
        //Variables
        int Diasdeahorro;
        double total, Ahorrodial=1;
        //Datos de Entrada
        System.out.println("Ingrese cuantos dias que ahorrara: ");
        Diasdeahorro=teclado.nextInt();
        for (int numero=1; numero<=Diasdeahorro; numero++) {
            total=Ahorrodial*3;
            Ahorrodial=total;
            System.out.println("Felicidades su ahorro en el dia "+numero+" es de:"+total);
        }
        //Datos de salida
    }
    public static void main(String[] args) {
        Ahorrodemividad();
    }
}
