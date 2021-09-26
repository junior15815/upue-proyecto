package Trabajo;
import java.util.Scanner;

import Trabajo2.Celular;
import Trabajo2.Person;


public class  Ejercicio1{
    
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione la opcion que desea:"+"\n1=Datos de persona"+"\n2=Datos de celular");
        int opcionAlg= sc.nextInt();
        do{
            switch(opcionAlg){
                case 1:         
                Person pl= new Person();
                pl.setName("Jose");
                pl.laugh();
                System.out.println("Hola");
                Person pl2= new Person();
                pl2.setName("Mary");
                pl2.laugh();
                break;
                case 2:
                Celular c1= new Celular("","");
                c1.setColor("Negro");
                c1.setNombre("Redmi");
                c1.llamar();
                Celular c2= new Celular("","");
                c2.setColor("Verde");
                c2.setNombre("Sony");
                c2.llamar();
                break;
                default: System.out.println("Opcion no existe!"); break;   
            }
        }while (opcionAlg==0);
    }
}