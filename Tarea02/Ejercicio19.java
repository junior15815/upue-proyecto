import java.util.Scanner;
public class Ejercicio19 {
    static Scanner teclado=new Scanner(System.in);
    public static void comosaberlasventas(){
        //Ejercicio4.13
        int numventas=0, contador=1, fail=0;
        double cant1=0, cant2=0, cantidad=0, venta1=0, venta2=0, total=0;
        System.out.println("Total de ventas es: ");
        numventas=teclado.nextInt();
        while (contador<numventas){
            System.out.println("Ingrese el valor de la venta "+contador+": ");
            cantidad=teclado.nextDouble();
            total=cantidad+total;
            if(cantidad<=100000){
                venta1=venta1+cantidad;
                cant1++;
            }
            if(cantidad>100000 && cantidad<20000){
                venta1=venta1+cantidad;
                cant1++;
            }
            if(cantidad>20000){fail++;}
            contador++;
        System.out.println("De acuerdo a sus "+numventas+": "+
        "\nLa cantidad de ventas menores o igual a 10000 es de: "+cant1+
        "\nLa cantidad de ventas mayores a 10000 y menores de 20000 es de: "+cant2+
        "\nLa cantidad de numeros fuera de los requisitos es de: "+fail+
        "\nLa suma de ventas de menores a 10000 es de:"+venta1+
        "\nLa suma de ventas mayores a 10000y menores a 20000 es de: "+venta2+
        "\nLa suma total de todas sus cantidades es de: "+total);    
        }
    }
    public static void main(String[] args) {
        comosaberlasventas();
    }
}
