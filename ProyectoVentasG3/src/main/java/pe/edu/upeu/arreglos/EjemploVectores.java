package pe.edu.upeu.arreglos;

public class EjemploVectores {
    
    public static void conceptosVectores() {
        //variable vectores
        int[] vector;
        //dando tamaño al vector
        vector = new int[10];
        //asignando valores al vector
        vector[0]=20;
        vector[9]=10;
        vector[0]=40;
        System.out.println(vector[0]);
        //asignando valores director al vector
        int[] vA={20,2,30,4,5,6,7,8,9,10};
        System.out.println("Imprimiendo los valores de la posicion7 y 0");
        System.out.println(vA[7]);//imprimir el valor 8 del vector vA
        System.out.println(vA[0]);//imprimir el valor 20 del vector vA
        //como saber el tamaño de un vector
        System.out.println("tamaño del vector vA "+(vA.length));
    }
    public static void tablaMultiplicar() {
        int[] vA ={1,2,3,4,5,6,7,8,9,10};
        int[] vB ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i=0; i<vA.length; i++){
            for (int j=0; j<vB.length; j++){
                System.out.println(vA[i]+"*"+vB[j]+"="+(vA[i]*vB[j]));
            }
            System.out.println("");
        }
        
    }
    public static void invertirVector(){
        int[] a={1,2,3,4,5};// vector invertido b={5,4,3,2,1,}
        int[] b=new int[a.length];

        for(int i=b.length-1; i>=0; i--){
            b[i]=a[(b.length-1)-i];
        }
        for(int i=0; i<b.length; i++){
            System.out.println("b["+i+"]"+b[i]);
        }
    }
    public  static void contarElementosVecCerosPosNeg(int[] vector){
        int cantCeros=0, cantPost=0, cantNeg=0;
        for (int i=0; i<vector.length; i++){
            if (vector[i]<0){
                cantNeg++;
            }else if(vector[i]==0){
                cantCeros++;
            }else{
                cantPost++;
            }

        }
        System.out.println("Elementos con valores negaticos son: "+cantCeros);
        System.out.println("Elementos con valores positivos son: "+cantPost);
        System.out.println("Elementos con valores negaticos son: "+cantNeg);
    }
    public static void main(String[] args){
        System.out.println("Invertir vectores: ");
        //invertirVector();
        int[] vA={1,2,3,4,5,6,7,8,9,10,-5,2,8,-7,3,0};
        contarElementosVecCerosPosNeg(vA);

    }
    
}
