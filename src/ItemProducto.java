
public class ItemProducto {
	private String Nombre;
	@Override
	public String toString() {
		return "ItemProducto [Nombre=" + Nombre + ", Precio=" + Precio + ", Impuesto=" + Impuesto + ", Cantidad="
				+ Cantidad + "]";
	}
	
	private float Precio;
	private float Impuesto;
	private int Cantidad;
	
	
	public ItemProducto(String nombre, float precio, float impuesto, int cantidad) {
		Nombre = nombre;
		Precio = precio;
		Impuesto = impuesto;
		Cantidad = cantidad;
	}
	
	public float CalcularTotal() {
		   return (Precio * Cantidad) + (Precio * Cantidad * Impuesto);
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public float getImpuesto() {
		return Impuesto;
	}

	public void setImpuesto(float impuesto) {
		Impuesto = impuesto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	
	
	
	
}
