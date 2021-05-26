import java.util.Scanner;
public class Ejercicio20 {
    static Scanner teclado=new Scanner(System.in);
    public static void pagoHamburgesas() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }


    public static void main(String[] args) {
        //contarNumerosNegPosCero();
        pagoHamburgesas();
    }
    
}
