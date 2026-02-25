public class Venta {
    
    private String Codigoproducto;
    private String Nombreproducto;
    private int CantidadVendida;
    private double ValorTotal;

    public Venta(String Codigoproducto, String Nombreproducto, int CantidadVendida, double ValorTotal) {
        this.Codigoproducto = Codigoproducto;
        this.Nombreproducto = Nombreproducto;
        this.CantidadVendida = CantidadVendida;
        this.ValorTotal = ValorTotal;
    }

    public String getCodigoproducto() {
        return Codigoproducto;
    }

    public String getNombreproducto() {
        return Nombreproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        Codigoproducto = codigoproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        Nombreproducto = nombreproducto;
    }

    public int getCantidadVendida() {
        return CantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        CantidadVendida = cantidadVendida;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }
    
}
