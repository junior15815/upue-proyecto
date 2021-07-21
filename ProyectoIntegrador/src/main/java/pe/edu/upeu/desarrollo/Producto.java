package pe.edu.upeu.desarrollo;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaJV;
import pe.edu.upeu.modelo.ProductoJV;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class Producto extends AppCrud {
    LeerArchivo lar;
    CategoriaJV catTO;
    ProductoJV proJV;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public void registrarProducto(){
        proJV=new ProductoJV();
        mostrarCategorias();
        proJV.setIdCateg(lte.leer("", "Ingrese el Id de categoria:"));
        proJV.setNombre(lte.leer("","Ingrese nombre producto"));
        lar = new LeerArchivo("Producto.txt");
        proJV.setIdProducto(generarId(lar, 0, "P", 1));
        proJV.setUnidaMed(lte.leer("", "Ingrese Unidad de medida"));
        proJV.setPrecioUnit(lte.leer(0.0, "Ingrese Precio del producto, segun la unidad de medida"));
        proJV.setStock(lte.leer(0.0, "Ingrese el Stock:"));
        lar=new LeerArchivo("Producto.txt");
        agregarContenido(lar, proJV);

    }

    public void mostrarCategorias(){
        lar=new LeerArchivo("Categoria.txt");
        Object[][] datax=listarContenido(lar);
        for(int i=0;i<datax.length;++i){
            System.out.println(datax[i][0]+"="+datax[i][1]+",");
        }
        System.out.println("");
    }
    public void reporteProducto(){
        lar=new LeerArchivo("Producto.txt");
        imprimirLista(listarContenido(lar));
    }

    public void reporteProductos() {
        lar=new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(lar);
	    ut.pintarLine('H', 31);
        ut.pintarTextHeadBody('H', 2, "ID,Nombre,IdCateg,U.Medida,P.Unit,Stock");
        System.out.println("");
        ut.pintarLine('H', 31);
        String dataB="";
        for (int i = 0; i < data.length; i++) {
            dataB=data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][3]+
            ","+data[i][4]+","+data[i][5];
            ut.pintarTextHeadBody('B', 2, dataB);            
        }        
    }

    
}
