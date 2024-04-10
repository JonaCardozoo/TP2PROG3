
public class BillDiscount extends Modificador {
	
	protected float montoFijo;
	
	private Factura<Modificador> factura = new Factura<Modificador>();
	public BillDiscount(String nombreDescuento, float porcentaje, float montoFijo, Factura<Modificador> factura) {
		super(nombreDescuento, porcentaje);
		this.montoFijo = montoFijo;
		
	}
	
	@Override
	public double applayProductDiscount() {
		return 0;
	}

	@Override
	public double applayBillDiscount() {
		
		double descuento = 0;
		if(porcentaje > 0) {
			descuento= factura.getMontoTotal() *(porcentaje/100);
		}
		else {
			descuento = montoFijo;
		}
		
		return descuento;
	}
	
	
}
