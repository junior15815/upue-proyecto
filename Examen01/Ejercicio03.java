import java.util.Scanner;
class Ejercicio03{
  static Scanner teclado =new Scanner(System.in);
  static void ejercicio03JVO(){
    //Inicio
    System.out.println("hola, bienvenido a la campaña de vacunacion");
    //Datos de entrada
    String sexo, vacuna;
    int años;
    try{
    System.out.println("Introdusca su sexo por favor:\nH=Hombre\nM=Mujer");
    sexo=teclado.next();
    System.out.println("Introdusca su edad por favor:");
    años=teclado.nextInt();
    //Proceso
    if(sexo.equals("H") && años>=70){
      vacuna="C";
    }else if(sexo.equals("M") && años>=70){
      vacuna="C";
    }else if(sexo.equals("H") && años<=69 && años>=16){
      vacuna="A";
    }else if(sexo.equals("H") && años<16){
      vacuna="A";
    }else if(sexo.equals("M") && años<16){
      vacuna="A";
    }else{
      if(sexo.equals("M") && años<=69 && años>=16){
        vacuna="B";
      }else{
        vacuna="Error, por favor introdusca bien los datos";
      }
      }
      System.out.println("Felicidades usted resivira la vacuna:"+vacuna);
    }catch(Exception e){
      System.out.println("Error ingrese nuevamente los datos");
    }
  }
    public static void main (String[] arg){
      ejercicio03JVO();
    }
  }