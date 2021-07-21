package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDetalleTO {
    public String idVentaDetalle, idVenta, idProducto;
    public double precioUnit, porcentUtil, precioTotal, Cantidad;

    
}
