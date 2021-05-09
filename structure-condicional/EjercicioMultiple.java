import java.util.Scanner;
class EjercicioMultiple{
  static Scanner teclado=new Scanner(System.in);
  static void notaPostulanteEstMultiple(){
    //Definir variables
    String areaCarrera;
    double notaEP, notaRM, notaRV, notaAB, notaFinal=0;
    //Datos Entrada
    System.out.println("Introduce el area a la que corresponde tu carrera:\nB=Biomedicas\nI=Ingenieria\nS=Sociales");
    areaCarrera=teclado.next();
    System.out.println("Ingrese la nota de EP:");
    notaEP=teclado.nextDouble();
    System.out.println("Ingrese la nota de RM:");
    notaRM=teclado.nextDouble();
    System.out.println("Ingrese la nota de RV:");
    notaRV=teclado.nextDouble();
    System.out.println("Ingrese la nota de AB:");
    notaAB=teclado.nextDouble();   
    //Proceso
    switch(areaCarrera){
      case "B":{
        notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30);
        areaCarrera="Biomedicas";
        }break;
      case "I":{
        notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15);
        areaCarrera="Ingenierias";        
      }break;
      case "S":{
        notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
        areaCarrera="Sociales";        
      }break;
      default:{ System.out.println("La opcion que ingreso no es valida...intente nuevamente!."); } break;
    }
    //Datos de salida
    System.out.println("El postulante obtuvo un nota de:"+notaFinal+"\nY su carrera corresponde al area de:"+areaCarrera);

  }
}