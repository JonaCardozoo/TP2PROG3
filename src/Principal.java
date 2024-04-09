import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		
		Caso1();
		
	}
	
	public static void Caso1() {
		Factura<Modificador> factura = new Factura<>();
		
		ItemProducto producto1 = new ItemProducto("Bicicleta",780000, 0.21F, 1);
		ItemProducto producto2 = new ItemProducto("Vaporera",94000.00f, 0.105F, 3);
			
		Modificador descuento1 = new ProductDiscount("Samsung", 0.05F, producto1);
		Modificador descuento2 = new ProductDiscount("Noblex", 0.03F, producto2);
		
		Modificador descuento3 = new BillDiscount("Black Friday", 0.2F, 10000F,factura);
		
		factura.getListaProducto().add(producto1);
		factura.getListaProducto().add(producto2);
		factura.getListaModificadores().add(descuento1);
		factura.getListaModificadores().add(descuento2);
		factura.getListaModificadores().add(descuento3);
		
		
		double Total = new Calculador<Modificador>().calcularMontoFinal(factura);
		System.out.println("Total caso 1: $" + Total);
	}

}
