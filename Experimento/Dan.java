package Experimento;
import java.util.Scanner;
public class Dan {

    static Scanner teclado = new Scanner(System.in);

    public static void niveldocente() {

        //variables, datos de entrada y proceso

        System.out.println("Ingresa tu nivel academico \nlas opciones son:\nadjunto\nauxiliar\nasistente\ntitular");
        String nivel=teclado.next();

        System.out.println("Ingresa tu salario");

        Double salario=teclado.nextDouble();

        switch (nivel.toLowerCase()) {
            case "adjunto":salario=salario+(salario*0.035); break;
            case "auxiliar":salario=salario+(salario*0.041); break;
            case "asistente":salario=salario+(salario*0.050); break;
            case "titular":salario=salario+(salario*0.060); break;

            default:System.out.println("Los datos que ingreso, son incorrectos");break;
        }
        //datos de salida
        System.out.println("la categoria o nivel que usted tiene es "+nivel+" y tu nuevo salario es de: $"+salario);

    }
    

    public static void main(String[] args) {
        System.out.println("Holas");

        niveldocente();
        
    }
    
}