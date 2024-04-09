public final class Algorithm {
	public static <T extends Comparable<T>> T max(T x, T y) {
 return x.compareTo(y) > 0 ? x:y;
 }
	
} 


// Este codigo no funciona ya que esta queriendo devolver cual es el mayor, si x o y, pero no podemos comparar los tipos T 
// ya que son genericos, lo que deberiamos hacer es usar un compareTo, que nos va permitir comparar los objetos entre si


