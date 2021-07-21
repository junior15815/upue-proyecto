package pe.edu.upeu.jvo.examen;
import pe.edu.upeu.jvo.Utils.*;
public class ResolucionExamen {
    private static void ejercicio04(){
        LeerTeclado jvo = new LeerTeclado();
        int num, residuo, i=1;
        System.out.println("Bienenido al Systema que definira divisores\n");
        num=jvo.leer(0,"Introdusca el numero natural");
        while(i<=num){
            residuo=num%i;
            if(residuo==0){
                System.out.println(i);
            }
            residuo=residuo+residuo;
            i++;
        }
        System.out.println("\n La cantidad de divisores encontrados es de: "+i);
    }

    private static void ejercicio02(){
        LeerTeclado jvo = new LeerTeclado();
        int cat=1;
        double total01=0, valor, total02=0, total03=0;
        System.out.println("Bienvenido");
        for(int i=1;i<=3;i++){
            total02=0;
            cat =jvo.leer(0,"\nIngrese la cantidad de automóviles de la categoria "+i+": ");
            for(int is= 1; is <=cat; is++){
                valor = jvo.leer(0, "Ingrese el valor del automóvil "+is+" de esta categoria:");
                if(i==1){
                    total01=valor*0.12;
                }
                if(i==2){
                    total01=valor*0.08;
                }
                if(i==3){
                    total01=valor*0.05;
                }
                System.out.println("Lo que se paraga por el automóvil "+is+" de la categoria "+i+" es de "+total01);
                total02=total01+total02;
            }
            System.out.println("El total a pagar de la categoria "+i+" es de "+total02);
            total03=total02+total03;
        }
        System.out.println("En total, por todos los autos debe pagar "+total03);
    }

    private static void ejercicio03(){
        int total0=0, resolucion=10, resolucion2=20;
        for(int numero = 1; numero <=resolucion2; numero++){
            for(int i = 1; i <=resolucion; i++){
                total0=i*numero;
                System.out.println(""+numero+"x"+i+"= "+total0);
            }
        }
    }
    public static void ejercicio05() {
        LeerTeclado jvo=new LeerTeclado();
        int base=jvo.leer(0, "Introdusca la base: ");
        int exponente=jvo.leer(0, "Introdusca el exponente");
        System.out.println(potencia(base, exponente));
    }
    public static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        }else if (exponente==1){ 
            return base;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }

    public ResolucionExamen(){
        LeerTeclado jvo = new LeerTeclado();
        String opcion;
        opcion=jvo.leer("","Por favor elija que proceso quiere realizar\n\nA=Impueso de automóviles\nB=Tabla de multiplicar\nC=Hallar divisores\nD=Potencia\nSi desea salir precione cualquier otra letra");
        switch (opcion.toUpperCase()){
            case "A":{
                ejercicio02();
                new ResolucionExamen();
            }break;
            case "B":{
                ejercicio03();
                new ResolucionExamen();
            }break;
            case "C":{
                ejercicio04();
                new ResolucionExamen();
            }break;
            case "D":{
                ejercicio05();
            }break;
        }
    }
}
