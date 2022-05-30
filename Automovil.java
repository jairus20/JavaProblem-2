
package CapaNegocio;

public class Automovil {
    private String codAutomvil;
    private String PlacaAutomovil ;
    private String ModeloAutomovil;
    public double CostoAutomvil;
    public RegistroVenta estaRegistroVenta;

   
    public void CostoAutomvil(double c){
        CostoAutomvil = c;
    }
    
    public Automovil (String a, String b){
        codAutomvil = a;
        PlacaAutomovil = b;
    }
    
    public void estaRegistroVenta(RegistroVenta c){
        estaRegistroVenta = c;
    }

    public String getCodAutomvil() {
        return codAutomvil;
    }

    public void setCodAutomvil(String codAutomvil) {
        this.codAutomvil = codAutomvil;
    }

    public String getPlacaAutomovil() {
        return PlacaAutomovil;
    }

    public void setPlacaAutomovil(String PlacaAutomovil) {
        this.PlacaAutomovil = PlacaAutomovil;
    }

    public String getModeloAutomovil() {
        return ModeloAutomovil;
    }

    public void setModeloAutomovil(String ModeloAutomovil) {
        this.ModeloAutomovil = ModeloAutomovil;
    }
    
    
}
