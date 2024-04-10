import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		
		Caso1();
		
	}
	
	public static void Caso1() {
		Factura<Modificador> factura = new Factura<>();

	    ItemProducto producto1 = new ItemProducto("Bicicleta", 780000, 0.21f, 1); 
	    ItemProducto producto2 = new ItemProducto("Vaporera", 94000, 0.105F, 3);

	    ProductDiscount descuento1 = new ProductDiscount("Samsung", 05f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Noblex", 9F, producto2);

	    BillDiscount descuento3 = new BillDiscount("Black Friday", 0, 100000f, factura);

	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListaModificadores().add(descuento1); 
	    factura.getListaModificadores().add(descuento2);
	    factura.getListaModificadores().add(descuento3);

	    double total = new Calculador<Modificador>().calcularMontoTotal(factura);
	    System.out.println("Total caso 1: $" + String.format("%.2f", total));
	}

}
