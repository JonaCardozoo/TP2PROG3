
public class BillDiscount extends Modificador {
	protected float montoFijo;
	
	private Factura<Modificador> factura = new Factura<Modificador>();
	ItemProducto item = new ItemProducto("",0F,0F,1);
	public BillDiscount(String nombreDescuento, float porcentaje, float montoFijo, Factura<Modificador> factura) {
		super(nombreDescuento, porcentaje);
		this.montoFijo = montoFijo;
		this.factura = factura;

	}
	
	@Override
	public double applayProductDiscount() {
		return 0;
	}

	@Override
	public double applayBillDiscount() {
//		double subtotal = factura.getMontoTotal();
//		
//		double totalConDescuento = 0;
//		
//		if(porcentaje <=0) {
//			totalConDescuento = montoFijo;
//		}
//		
//		else {
//			
//			totalConDescuento = subtotal * getPorcentaje() * item.getCantidad();
//			
//		}
//		
//		return totalConDescuento;
		
		return (factura.getMontoTotal() * porcentaje) + montoFijo;
	}
}
