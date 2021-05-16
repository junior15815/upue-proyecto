public class Ejercicio01 {
    static Scanner teclado=new Scanner(System.in);

    public static void Sumadeporcentajealanho() {
      //Datos de entrada
      int años=1;
      double sueldo, sumasueldo=0;
      //Repeticion
      while (años<=6) {
        System.out.println("Ingrese su sueldo en el año"+años+":");
        sueldo=(sumasueldo*0.10)+sueldo;
        años++;
      }
      System.out.println("Su sueldo del año 6:"+sumasueldo);
    }
    public static void main(String[] args){
      Sumadeporcentajealanho();
    }
}
