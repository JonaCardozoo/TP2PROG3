import java.util.*;

public class Factura<T> {

	private double montoTotal = 0.0;
	private List<T> listaModificadores;
	private List<ItemProducto> ListaProducto;
	
	public Factura() {
		listaModificadores = new ArrayList<>();
		ListaProducto = new ArrayList<>();
	}
	
	public double getMontoTotal() { 
		return montoTotal; 
	}
	
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public List<T> getListaModificadores(){
		return listaModificadores;
	}
	public List<ItemProducto> getListaProducto(){
		return ListaProducto;
	}
	
	
	
}
