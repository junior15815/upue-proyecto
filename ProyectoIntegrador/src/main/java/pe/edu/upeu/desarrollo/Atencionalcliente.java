package pe.edu.upeu.desarrollo;
import java.text.SimpleDateFormat;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.Atencion;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import java.util.Date;

public class Atencionalcliente extends AppCrud{
    LeerArchivo lar;
    Atencion aten;
    LeerTeclado lte=new LeerTeclado();
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");
    UtilsX ut=new UtilsX();
    public void cliente(){
        aten=new Atencion();
        lar=new LeerArchivo("Atencioncli.txt");
        //aten.set(generarId(lar, 0, "DV", 2));
        System.out.println("Bienvenido al cuestionamiento, donde\nla palabra de nuestros clientes importan");
        aten.setNombre(lte.leer("","Ingrese el nombre del cliente"));
        aten.setFechaCuestion(formatoFecha.format(new Date()));
        int opciones=(lte.leer(0,"Tenemos las siguientes ramas para la atencion de clientes: \n1=Sugerencias\n2=Reglamos\n3=Alguna apreciacion o agradecimiento\n4=Saber los beneficios"));
        if (opciones==1){aten.setNota(lte.leer("","Ingrese el comentario que desaea realizar"));}
        else if (opciones==2){aten.setNota(lte.leer("","¿Acerca de que desea realizar el reclamo?"));}
        else if (opciones==3){aten.setNota(lte.leer("","Gracias por su preferencias ¿Sobre que desea hacer la felicitacion o agardecimiento?"));}
        else if (opciones==4){System.out.println("Los beneficios con los que el cliente cuenta son:\n1. Servicio deliberi\n2. Servicio de opinion\n3. Establecimiento seguro\n4. Buen trato al cliente\n5. Facturas y boletas\n6. Productos de calidad\n7. Atencion de 6:30am a 10:30pm");}
        aten.setRamas(""+opciones);
        agregarContenido(lar, aten);       
    }   
    public void reportarAten(){
        lar=new LeerArchivo("Atencioncli.txt");        
        imprimirLista(listarContenido(lar));
    }
    
}
