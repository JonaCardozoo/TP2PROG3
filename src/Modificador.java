
abstract class Modificador {
	protected String nombreDescuento;
	protected float porcentaje;
	
	public Modificador(String nombreDescuento, float porcentaje) {
		
		this.nombreDescuento = nombreDescuento;
		this.porcentaje = porcentaje;
	}

	public String getNombreDescuento() {
		return nombreDescuento;
	}

	public void setNombreDescuento(String nombreDescuento) {
		this.nombreDescuento = nombreDescuento;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	} 
	
	public abstract double applayProductDiscount(); 
	public abstract double applayBillDiscount();
		
	
	
	
}
