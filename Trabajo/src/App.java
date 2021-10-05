import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Buenas dia");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca un numero A ");
        int opcionA= sc.nextInt();
        System.out.println("Introdusca un numero B ");
        int opcionB= sc.nextInt();
        if(opcionA>opcionB) {
            System.out.println(opcionA+">"+opcionB);
        }
        if(opcionA<opcionB) {
            System.out.println(opcionA+"<"+opcionB);
        }
        if(opcionA==opcionB) {
            System.out.println(opcionA+"="+opcionB);
        }
    }
}
