
public class ProductDiscount extends Modificador {
	ItemProducto refProducto;

	public ProductDiscount(String nombreDescuento, float porcentaje, ItemProducto producto) {
		super(nombreDescuento, porcentaje);
		refProducto = producto;
	}
	
	public ItemProducto getRefProducto() {
		return refProducto;
	}

	public void setRefProducto(ItemProducto refProducto) {
		this.refProducto = refProducto;
	}
	
	@Override
	public double applayProductDiscount() {
		return refProducto.CalcularTotal() * (porcentaje/100);
	}
	@Override
	public double applayBillDiscount() {
		return 0;
	}
	
}
