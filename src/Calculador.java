
public class Calculador<M extends Modificador> {

	public double calcularMontoFinal(Factura<M> factura) {
		factura = this.calcularTotal(factura);
		factura = this.calcularDescuentoTotalPorFactura(factura);
		factura = this.calcularDescuentoTotalPorProductos(factura);
		return factura.getMontoTotal();
	}
	
	public Factura<M> calcularTotal(Factura<M> fac) {
		float Total = 0.0F;
		for (ItemProducto item : fac.getListaProducto()) {
			Total += item.CalcularTotal();
		}
		
		fac.setMontoTotal(Total);
		return fac;
	}

	public Factura<M> calcularDescuentoTotalPorProductos(Factura<M> fac) {
		float Total = 0.0F;
		for(M factura: fac.getListaModificadores()) {
			Total+= factura.applayProductDiscount();
		}
		
		fac.setMontoTotal(fac.getMontoTotal() - Total);
		return fac;
		
	}

	public Factura<M> calcularDescuentoTotalPorFactura(Factura<M> fac) {
		float Total = 0.0F;
		for(M factura: fac.getListaModificadores()) {
			Total+= factura.applayBillDiscount();
		}
		fac.setMontoTotal(fac.getMontoTotal() - Total);
		return fac;
	}

}