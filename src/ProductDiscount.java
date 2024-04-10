
public class ProductDiscount extends Modificador {
	ItemProducto refProducto;

	public ProductDiscount(String nombreDescuento, float porcentaje, ItemProducto producto) {
		super(nombreDescuento, porcentaje);
		this.refProducto = producto; 
	}
	
	public ItemProducto getRefProducto() {
		return refProducto;
	}

	public void setRefProducto(ItemProducto refProducto) {
		this.refProducto = refProducto;
	}
	
	 @Override
	    public double applayProductDiscount() {
	        double descuento = refProducto.getPrecio() * (getPorcentaje() / 100);
	        System.out.println("Descuento aplicado por " + getNombreDescuento() + ": " + descuento);
	        return descuento;
	    }
	@Override
	public double applayBillDiscount() {
		return 0;
	}
	
}
