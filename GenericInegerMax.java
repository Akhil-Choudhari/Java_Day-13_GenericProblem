package GenericMaxValue;

public class GenericInegerMax {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; 

	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max; 
	  } 

	  public static void main(String args[]) {
	    System.out.printf("Maximum out of %d, %d and %d is %d\n\n", 11, 9, 14, maximum(9, 11, 14));
}
}