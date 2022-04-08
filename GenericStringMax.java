package GenericMaxValue;

public class GenericStringMax {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; 

	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max; 
	  } 

	  public static void main(String args[]) {
	    System.out.printf("Maximum of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum(
	            "pear", "apple", "orange"));
}
}


