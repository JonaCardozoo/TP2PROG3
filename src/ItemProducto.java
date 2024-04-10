
public class ItemProducto {
	private String nombre;
	private float precio;
	private float impuesto;
	private int cantidad;

	public ItemProducto(String nombre, float precio, float impuesto, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.impuesto = impuesto;
		this.cantidad = cantidad;
	}

	public float CalcularTotal() {

		float montoTotal = precio * cantidad;
		float montoImpuesto = (montoTotal * impuesto);		 
		float montoTotalFinal = montoTotal + montoImpuesto;

		return montoTotalFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
	@Override
	public String toString() {
		return "ItemProducto [Nombre=" + this.nombre + ", Precio=" + this.precio + ", Impuesto=" + this.impuesto + ", Cantidad="
				+ this.cantidad + "]"; 
	}
}
