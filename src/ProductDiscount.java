
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
		   
		     double total = 0;
	        double descuento = refProducto.getPrecio() * refProducto.getCantidad() * getPorcentaje();
	        System.out.println(getRefProducto());
	        System.out.println("Monto total sin descuento: $" +refProducto.calcularTotal());	     
	        System.out.println("Descuento aplicado por " + getNombreDescuento() + ": $" + (-descuento ));
	        total = refProducto.calcularTotal() - descuento;
	        System.out.println("Total: " + total + "\n") ;
	        return descuento;
	    }
	 
	@Override
	public double applayBillDiscount() {
		return 0;
	}
}
