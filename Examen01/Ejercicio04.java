import java.util.Scanner;
class Ejercicio04{
  static Scanner teclado=new Scanner(System.in);
  static void Ejercicio04JVO(){
    //Inicio
    System.out.println("Hola");
    //Datos de entrada
    String operacion;
    double num1, num2, resultado=0;
    System.out.println("Ingrese el primer numero:");
    num1=teclado.nextDouble();
    System.out.println("Ingrese el segundo numero:");
    num2=teclado.nextDouble();
    System.out.println("Que operacion desea realizar.\n+=suma\n-=Resta\n*=Multiplicacion\n/=Division\nP=Potencia:");
    operacion=teclado.next();
    //Proceso
    switch(operacion){
      case "+":{
        resultado=(num1)+(num2);
      }break;
      case "-":{
        resultado=(num1)-(num2);
      }break;
      case "*":{
        resultado=(num1)*(num2);
      }break;
      case "/":{
        resultado=(num1)/(num2);
      }break;
      case "P":{
        resultado=num1;
        for (double i=1; i < num2; i++){
        resultado=resultado*num1;
        }
      }break;
      default:{System.out.println("ERROREIntrodusca bien los datos"); }break;
    }
    
    System.out.println("Su resultado es:"+resultado);
  }
  public static void main(String[] arg){
    Ejercicio04JVO();
  }
}