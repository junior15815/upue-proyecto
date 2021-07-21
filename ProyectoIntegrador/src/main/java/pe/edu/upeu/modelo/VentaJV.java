package pe.edu.upeu.modelo;

import lombok.Data;

@Data 
public class VentaJV {
    public String idVenta, DniCliente, fechaVenta;
    public double netoTotal, Igv, precioTotal;

    
}