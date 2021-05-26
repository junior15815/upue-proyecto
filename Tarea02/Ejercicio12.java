import java.util.Scanner;
public class Ejercicio12 {
    //Ejercicio4.8
    static Scanner teclado=new Scanner(System.in);
    public static void personaaparagar() {
        //Variables
        int numerodearticulos=0, numero=1;
        double preciodearticulo=0, descuentoarticulos=0;
        //Proceso
        while (numero<=numerodearticulos) {
            System.out.println("Ingrese porfavor el numero del articulo: ");
            numerodearticulos=teclado.nextInt();
            System.out.println("Ingrese el precio del articulo: ");
            preciodearticulo=teclado.nextDouble();
            //Condiciones para los descuentos
            if(preciodearticulo>=200){
                descuentoarticulos=preciodearticulo*0.15;
            }else if(preciodearticulo>100 && preciodearticulo<200){
                descuentoarticulos=preciodearticulo*0.12;
            }else if(preciodearticulo<100){
                descuentoarticulos=preciodearticulo*0.10;
            }
            numero++;
            System.out.println("El descuento del articulo "+numerodearticulos+" cuyo precio original es de "+preciodearticulo+", el descuento es de:"+descuentoarticulos);
        }
    }

    public static void main(String[] args){
        personaaparagar();
    }
}
