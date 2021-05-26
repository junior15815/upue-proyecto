import java.util.Scanner;
public class Ejercicio16 {
    static Scanner teclado=new Scanner(System.in);
    public static void Alumnosaprovadosydesaprobados() {
        //Ejercicio4.14
        //datos de entrada
        int canalumnos;
        double notaalumnos=0;
        System.out.println("Ingrese porfavor la cantidad de alumnos:");
        canalumnos=teclado.nextInt();
        for(int numero=1; numero<=canalumnos; numero++){
            System.out.println("Ingre la nota del alumno "+numero+":");
            notaalumnos=teclado.nextDouble();

            if (notaalumnos<=12){
                System.out.println("El alumno "+numero+": Esta desaprobado");
            }
            if (notaalumnos>=13){
                System.out.println("El alumno "+numero+": Esta aprobado");
            }
        }
    }
    public static void main(String[] args) {
        Alumnosaprovadosydesaprobados();
    }
}
