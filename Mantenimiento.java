
package CapaNegocio;

public class Mantenimiento {
    private String  codMantenimiento;
    private String fechaMantenimiento;
    private String  precioMantenimiento;
    private String descripcionMantenimiento;
    public RegistroVenta correspondeRegistroVenta;
            
    public Mantenimiento (String a, String b, String c, String d){
        codMantenimiento = a;
        fechaMantenimiento = b;
        precioMantenimiento = c;
        descripcionMantenimiento = d;
    }
    public void correspondeRegistroVenta(RegistroVenta e){
        correspondeRegistroVenta = e;
    } 

    public String getCodMantenimiento() {
        return codMantenimiento;
    }

    public void setCodMantenimiento(String codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }

    public String getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(String fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public String getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(String precioMantenimiento) {
        this.precioMantenimiento = precioMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }


}
