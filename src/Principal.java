import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		Caso1();
		System.out.println("------------------------------------------------------------------------- ");
		Caso2();
		System.out.println("------------------------------------------------------------------------- ");
		Caso3();
	}
	
	public static void Caso1() {
		Factura<Modificador> factura = new Factura<>();

	    ItemProducto producto1 = new ItemProducto("Bicicleta", 780000, 0.21f, 1); 
	    ItemProducto producto2 = new ItemProducto("Vaporera", 94000, 0.105F, 3);
	    
	    ProductDiscount descuento1 = new ProductDiscount("Samsung", 0.05f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Noblex", 0.03F, producto2);
	    BillDiscount descuento3 = new BillDiscount("Black Friday", 0, 10000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListaModificadores().add(descuento1); 
	    factura.getListaModificadores().add(descuento2);
	    factura.getListaModificadores().add(descuento3);

	    double total = new Calculador<Modificador>().calcularMontoTotal(factura);
	    System.out.println("Total caso 1: $" + String.format("%.2f", total));
	}
	
	public static void Caso2() {
		Factura<Modificador> factura = new Factura<>();
		
	    ItemProducto producto1 = new ItemProducto("Lavarropa", 510000F, 0.105F, 1); 
	    ItemProducto producto2 = new ItemProducto("Tostadora", 40000F, 0.21F, 2);
	    ItemProducto producto3 = new ItemProducto("Heladera", 890000F, 0.105F, 3); 
	    ItemProducto producto4 = new ItemProducto("Ventilador", 158000F, 0.21F, 4);
	    ProductDiscount descuento1 = new ProductDiscount("Samsung", 0.15f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Noblex", 0.35F, producto2);
	    ProductDiscount descuento3 = new ProductDiscount("Philco", 0.25F, producto3);
	    ProductDiscount descuento4 = new ProductDiscount("TCL", 0.1F, producto4);
	    BillDiscount descuento5 = new BillDiscount("Black Friday", 0.05F, 15000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListaProducto().add(producto3);
	    factura.getListaProducto().add(producto4);
	    factura.getListaModificadores().add(descuento1); 
	    factura.getListaModificadores().add(descuento2);
	    factura.getListaModificadores().add(descuento3);
	    factura.getListaModificadores().add(descuento4);
	    factura.getListaModificadores().add(descuento5);
	    
	    
	    double total = new Calculador<Modificador>().calcularMontoTotal(factura);
	    
	    System.out.println("Total caso 2: $" + String.format("%.2f", total));
	    
	}
	
	public static void Caso3() {
		Factura<Modificador> factura = new Factura<>();
		
	    ItemProducto producto1 = new ItemProducto("Notebook", 1400000F, 0.21F, 1); 
	    ItemProducto producto2 = new ItemProducto("Sony Music Center", 2600000F, 0.21F, 1);
	    
	    ProductDiscount descuento1 = new ProductDiscount("Lenovo", 0, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("JBL", 0.18F, producto2);
	   
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListaModificadores().add(descuento1); 
	    factura.getListaModificadores().add(descuento2);
	    
	    
	    double total = new Calculador<Modificador>().calcularMontoTotal(factura);
	    
	    System.out.println("Total caso 3: $" + String.format("%.2f", total));
	    
	}

}
