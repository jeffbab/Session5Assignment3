import java.lang.ArrayIndexOutOfBoundsException;

public class Assignment3 {
	/*
	 * Handle ArrayIndexOutOfBounds Exception. For example if array is having
	 * only 5 elements and we are trying to display 7th element then it should
	 * throw exception.
	 * 
	 */
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5};

		try {
			System.out.println(x[6]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
