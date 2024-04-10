
public class BillDiscount extends Modificador {
	protected float montoFijo;

	private Factura<Modificador> factura = new Factura<Modificador>();

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
		double descuento = montoFijo;

		System.out.println("Descuento aplicado por " + getNombreDescuento() + ": " + descuento);

		return descuento;
	}
}
