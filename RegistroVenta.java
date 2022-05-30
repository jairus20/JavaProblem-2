
package CapaNegocio;

public class RegistroVenta {
    private String codRegistro;
    private String fechahoraregistro;
    private String PrecioRegistro;
    public Mantenimiento tieneMantenimiento;
    public Cliente RegistroCliente;
    public Automovil consignaAutomovil;
    public Vendedor tieneVendedor; 

    public RegistroVenta (String a, String b, String c, Mantenimiento d){
        codRegistro = a;
        fechahoraregistro = b;
        PrecioRegistro = c;
        tieneMantenimiento = d;
    }
    
    public void Cliente (Cliente e){
        RegistroCliente = e;
    }
    
    public void consignaAutomovil(Automovil f){
        consignaAutomovil = f;
    }
    
    public void tieneVendedor(Vendedor g){
        tieneVendedor = g;
    }

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getFechahoraregistro() {
        return fechahoraregistro;
    }

    public void setFechahoraregistro(String fechahoraregistro) {
        this.fechahoraregistro = fechahoraregistro;
    }

    public String getPrecioRegistro() {
        return PrecioRegistro;
    }

    public void setPrecioRegistro(String PrecioRegistro) {
        this.PrecioRegistro = PrecioRegistro;
    }


}
