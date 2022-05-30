
package CapaNegocio;

public class Cliente {
    private String codCliente;
    private String nombreCliente;
    private String celularCliente;
    public RegistroVenta tieneRegistroVenta;

    
    public Cliente (String a, String b, RegistroVenta c, String d){
        codCliente = a;
        nombreCliente = b;
        tieneRegistroVenta = c;
        celularCliente = d;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

}
