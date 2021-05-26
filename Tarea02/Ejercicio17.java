import java.util.Scanner;
public class Ejercicio17 {
    //Ejercicio4.4
    static Scanner teclado=new Scanner(System.in);
    public static void focosdecolores01() {
         //Datos de entrada
         int contador=1, verdes=0, blancos=0, rojos=0, total=0;
        System.out.println("Bienbemnido al sistema para calcular la cantidad de focos");
        while (contador<=3) {
            if(contador==1){
                System.out.println("Ingrese por favor la cantidad de focos de color verde:");
                verdes=teclado.nextInt();
                total=total+verdes;
            }
            if(contador==2){
                System.out.println("Ingrese por favor la cantidad de focos de color blanco:");
                blancos=teclado.nextInt();
                total=total+blancos;
            }
            if(contador==3){
                System.out.println("Ingrese por favor la cantidad de focos de color rojo:");
                rojos=teclado.nextInt();
                total=total+rojos;
            }

            contador++;
        }
        System.out.println("La cantidad total de focos es de: "+total);
    }
    
    public static void main(String[] args) {
        focosdecolores01();
    }
}
