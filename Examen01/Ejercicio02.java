import java.util.Scanner;
class Ejercicio02{
  static Scanner teclado=new Scanner(System.in);
  static void  Ejercicio02JVO(){
    //Inicio
    System.out.println("hola bienvenido al bono maestro");
    //Variables
    double Puntaje, Salariominimo, Bono;
    try{
    //Datos de entrada
    System.out.println("Ingrese su Puntaje:");
    Puntaje=teclado.nextDouble();
    System.out.println("Ingrese su salario:");
    Salariominimo=teclado.nextDouble();
    //Proceso
    if(Puntaje<50){
      Bono=0;
    }else if(Puntaje>=50 && Puntaje<=100){
      Bono=Salariominimo*0.10;
    }else if(Puntaje>=101 && Puntaje<=150){
      Bono=Salariominimo*0.40;
    }else{
      Bono=Salariominimo*0.70;}
    System.out.println("Su bono es de:"+Bono);
    }catch(Exception e){
      System.out.println("Error al ingresar los dastos\nPorfavor ingrese los datos nuevamente");
    }
    }
    public static void main(String[] arg){
    
    Ejercicio02JVO();
    }
  }