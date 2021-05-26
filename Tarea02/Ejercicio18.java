import java.util.Scanner;
public class Ejercicio18 {
    static Scanner teclado=new Scanner(System.in);
    public static void interesdebanco(){
        //Ejercicio4.9
        int años, contador=1;
        double mensual=0, total=0, subtotal=0, inversionanual=0;
        System.out.println("Ingrese la cantidad que se depositara cada mes: ");
        mensual=teclado.nextDouble();
        System.out.println("Ingrese los años de interes a calcular: ");
        años=teclado.nextInt();
        inversionanual=mensual*12;
        while(contador<=años){
            subtotal=inversionanual+((subtotal*0.10)+subtotal);
            System.out.println("La suma total de intereces del año "+contador+" es de: "+(subtotal+subtotal*0.10)+"\nEl interes del año "+contador+" es de:"+subtotal*0.10);
            contador++;
        }
        total=subtotal+subtotal*0.10;
        System.out.println("\n\nLa cantidadtotal del año"+(contador-1)+" es de: "+total);
    }
    public static void main(String[] args) {
        interesdebanco();
    }
}
