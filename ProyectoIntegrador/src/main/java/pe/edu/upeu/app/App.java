package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.desarrollo.Atencionalcliente;
import pe.edu.upeu.desarrollo.Categoria;
import pe.edu.upeu.desarrollo.Producto;
import pe.edu.upeu.desarrollo.Usuario;
import pe.edu.upeu.desarrollo.Venta;
import pe.edu.upeu.gui.*;
import pe.edu.upeu.modelo.CategoriaJV;
import pe.edu.upeu.modelo.ProductoJV;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;
public class App {

   static Ansi color=new Ansi();

    public static void registrarCategoria(CategoriaJV categ) {
        System.out.println("--------Registro Categoria----------");
        System.out.println("IdCategoria: "+categ.getIdCateg()+" \tnombre: "+categ.getNombre());
    }
    
    public static void registrarProducto(ProductoJV prod) {
        System.out.println("--------Registro Producto----------");
        System.out.println("IdCategoria: "+prod.getIdCateg()+" \tnombre: "+prod.getNombre());
    }    

    public static void menuMain() {
        int opcionAlg=0;
        String mensaje="\nSeleccione el algortimo que desea probar:"+
        "\n1=Registro Categoria"+
        "\n2=Reporte Categoria"+
        "\n3=Registro Producto"+
        "\n4=Reporte Producto"+
        "\n5=Registro Usuario"+
        "\n6=Eliminar Usuario"+
        "\n7=Registro de Ventas"+
        "\n8=Reporte de Ventas entre rango de fechas"+
        "\n9=Atencion al cliente"+
        "\n0=Salir del Programa"
        ;
        Categoria daoCat;
        Usuario uDao;
        Producto proDao;
        Venta venDao;
        Atencionalcliente atenCli;
        UtilsX ut=new UtilsX();
        LeerTeclado lt=new LeerTeclado();
        opcionAlg=lt.leer(0, mensaje);
        do {                        
            switch (opcionAlg) {
                case 1: daoCat=new Categoria(); 
                daoCat.registrarCategoria(); break;
                case 2: ut.clearConsole(); daoCat=new Categoria(); 
                daoCat.reportarCategoria(); break;
                case 3: proDao=new Producto(); proDao.registrarProducto(); break;
                case 4: proDao=new Producto(); proDao.reporteProductos(); break;
                case 5:uDao=new Usuario(); uDao.registarUsuario(); break;
                case 6:uDao=new Usuario(); uDao.eliminarUsuario(); break;
                case 7: venDao=new Venta(); venDao.registroVentaGeneral();  break;
                case 8: venDao=new Venta(); venDao.reporteVentasPorFechas();  break;
                case 9: atenCli=new Atencionalcliente(); atenCli.cliente(); break;
                default: System.out.println("Opcion no existe!"); break;    
            }             
            if (opcionAlg!=0) {  
                String dato=lt.leer("", "Desea seguir probando algoritmos?: SI/NO");              
                if(dato.toUpperCase().equals("SI")){
                    opcionAlg=lt.leer(0, mensaje);      
                }else{
                    opcionAlg=0;
                }                
            }
        } while (opcionAlg!=0);        
    }    
    
    public static void validarAccesoSistema() {
        LeerTeclado lt=new LeerTeclado();
        System.out.println("****************Acceso al Sistema***********");
        String usuario=lt.leer("", "Ingrese su Usuario:");
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clave=cons.readPassword();
        Usuario uDao=new Usuario();

        if(uDao.login(usuario, String.valueOf(clave))){
            menuMain();
        }else{
            System.out.println("Error!...Intente Nuevamente!!");
            validarAccesoSistema();
        }
    }

    public static void main( String[] args ){
        //menuMain();
        AnsiConsole.systemInstall();
        System.out.println( color.bgBrightGreen().fg(RED).a("Hello").fg(BLACK).a(" World").reset() );
        validarAccesoSistema();
    }
}
