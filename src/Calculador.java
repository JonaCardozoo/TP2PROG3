import java.util.List;

public class Calculador<M extends Modificador> {

	public double calcularMontoTotal(Factura<M> factura) {
		factura = calcularTotalFactura(factura);
		factura = calcularDescuentoTotalPorProductos(factura);
		factura = calcularDescuentoTotalPorFactura(factura);
		
		return factura.getMontoTotal();
	}
	
	public Factura<M> calcularTotalFactura(Factura<M> fac) {
		float total = 0.00f;		
		for (ItemProducto item : fac.getListaProducto()) {					
			total += item.CalcularTotal();
		}		
		fac.setMontoTotal(total);		
		return fac;
	}
	
	public Factura<M> calcularDescuentoTotalPorProductos(Factura<M> fac) {
        float totalDescuento = 0;
        for (M modificador : fac.getListaModificadores()) {
            totalDescuento += modificador.applayProductDiscount();
        }
        
        fac.setMontoTotal(fac.getMontoTotal() - totalDescuento);
        return fac;
    }
	
    public Factura<M> calcularDescuentoTotalPorFactura(Factura<M> fac) {
        float totalDescuento = 0;
        for (M modificador : fac.getListaModificadores()) {
            totalDescuento += modificador.applayBillDiscount();
        }
        fac.setMontoTotal(fac.getMontoTotal() - totalDescuento);
        return fac;
    }
    
    public double calcularMontoTotales(List<ItemProducto> lista) {
    	double total = 0;
    	for(ItemProducto p : lista) {
    		total += p.CalcularTotal();
    	}
    	
    	return total;
    }

}