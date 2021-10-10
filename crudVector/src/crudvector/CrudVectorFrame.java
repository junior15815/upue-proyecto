package crudvector;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.*;
        
public class CrudVectorFrame extends JFrame {

    metodosSistema metodos = new metodosSistema();

    JLabel lb_nombre= new JLabel("Nombre");
    JTextField txt_nombre= new JTextField();  

    JLabel lb_apellido_paterno = new JLabel("Ap. Paterno");
    JTextField txt_apellido_paterno= new JTextField(); 

    JLabel lb_apellido_materno = new JLabel("Ap. Materno");
    JTextField txt_apellido_materno= new JTextField();
    
    JLabel lb_codigo = new JLabel("Codigo");
    JTextField txt_codigo= new JTextField();

    public CrudVectorFrame(){
        JMenuBar menuBar        = new JMenuBar();

        JMenu menuFile          = new JMenu();
        JMenu menuMantenimiento = new JMenu();
        JMenu menuA_Cliente     = new JMenu(); 
        JMenu menuReportes      = new JMenu(); 

        JMenuItem menuFile_Exit            = new JMenuItem(); 

        JMenuItem menuMantemiento_Ingresar = new JMenuItem();
        JMenuItem menuMantemiento_Eliminar = new JMenuItem(); 

        JMenuItem menuReportes_General     = new JMenuItem();
        JMenuItem menuReportes_Detallado   = new JMenuItem();
        JMenuItem menuReportes_Aplicacion  = new JMenuItem();
        
        menuFile.setText("File");
        menuFile_Exit.setText("Salir");   

        menuMantenimiento.setText("Crud");
        menuMantemiento_Ingresar.setText("Registrar");
        menuMantemiento_Eliminar.setText("Eliminar");
        
        menuReportes.setText("Reportes");
        menuReportes_General.setText("Global");
        menuReportes_Detallado.setText("Detalle");
        menuReportes_Aplicacion.setText("Aplicacion");
        menuA_Cliente.setText("Aten. Cliente");
        
        menuFile.add(menuFile_Exit);        
        menuMantenimiento.add(menuMantemiento_Ingresar);        
        menuMantenimiento.add(menuMantemiento_Eliminar);
        menuReportes.add(menuReportes_General);
        menuReportes.add(menuReportes_Detallado);  
        menuReportes.add(menuReportes_Aplicacion);       
        
        menuBar.add(menuFile);
        menuBar.add(menuMantenimiento);
        menuBar.add(menuA_Cliente);
        menuBar.add(menuReportes);
        
        
        setTitle("PRACTICANDO CRUD CON VECTOR");
        setJMenuBar(menuBar);
        setSize(new Dimension(700,700));

        
        menuFile_Exit.addActionListener
        (   new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 System.exit(0);
               }
            }
        );
        
        
        menuMantemiento_Eliminar.addActionListener
        (   new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 
                    //metodos.remove(0);
                    
               }
            }
        );
        
           
        menuMantemiento_Ingresar.addActionListener
        (   new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   JPanel pan1 = new JPanel(new GridLayout(1,2));
                   pan1.add(lb_nombre);
                   pan1.add(txt_nombre);
                   
                   JPanel pan2 = new JPanel(new GridLayout(1,2));
                   pan2.add(lb_apellido_paterno);
                   pan2.add(txt_apellido_paterno);
                   
                   JPanel pan3 = new JPanel(new GridLayout(1,2));
                   pan3.add(lb_apellido_materno);
                   pan3.add(txt_apellido_materno);
                   
                   JPanel pan4 = new JPanel(new GridLayout(1,2));
                   pan4.add(lb_codigo);
                   pan4.add(txt_codigo);
                   
                   Object msg []={pan1, pan2, pan3, pan4};
                   
                   if(JOptionPane.showOptionDialog(null, msg, "Registrar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){

                       datosPersona dp= new datosPersona();
                       dp.nombres= txt_nombre.getText();
                       dp.ap_paterno=txt_apellido_paterno.getText();
                       dp.ap_materno=txt_apellido_materno.getText();
                       dp.codigo=txt_codigo.getText();
                       System.out.print("insertanddoooooo"+dp.nombres);                               
                       metodos.registrarPersonaExamen(dp);//aqui
                       JOptionPane.showMessageDialog(
                                                      null,
                                                      "Se registro con exito",
                                                      "Registro", 
                                                      JOptionPane.INFORMATION_MESSAGE 
                                                    );
                   }
                }
            }
        );
        
        
        menuReportes_General.addActionListener
        (   new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 
                    String columnas[] = {"Nombres","Paterno","Materno", "Codigo"};
                    Object filas[][]= new Object[metodos.listaPersonas.size()][4];
                    
                    ArrayList nuevoVector= metodos.listaPersonas;
                    for(int i=0;i<nuevoVector.size();i++){
                      datosPersona v= (datosPersona)metodos.listaPersonas.get(i);
                      filas[i][0]=v.nombres;
                      filas[i][1]=v.ap_paterno;
                      filas[i][2]=v.ap_materno;
                      filas[i][3]=v.codigo;
                    }
                    
                    JTable tabla = new JTable(filas, columnas);
                    JScrollPane tabla1 = new JScrollPane(tabla);
                    
                    JPanel reporte= new JPanel();
                    reporte.add(tabla1);
                    
                    Object msg []={reporte};                    
                    JOptionPane.showMessageDialog(null,msg,"Reporte", JOptionPane.QUESTION_MESSAGE);
               }
            }
        );
        
    }
    
    
}
