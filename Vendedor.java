
package CapaNegocio;

public class Vendedor {
    private String codVendedor;
    private String nombreVendedor;
    private String celularVendedor;
    public RegistroVenta suscribeRegistroVenta;

    public Vendedor (String a, String b){
        codVendedor = a;
        nombreVendedor = b;
    }
    
    public void celularVendedor(String c){
        celularVendedor = c;
    }
    
    public void suscribeRegistroVenta(RegistroVenta c){
        suscribeRegistroVenta= c;
    }

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
    }

}



