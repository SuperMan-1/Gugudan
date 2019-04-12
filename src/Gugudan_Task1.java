
public class Gugudan_Task1 {

	public static int[] calculate (int times1, int times2) {
		
		int[] result = new int[times2] ;

		for (int i=1;i<=times2;i++) {
			result[i-1] = times1 * i ;
		}

		return result ;
	}

	public static void print(int times1, int times2, int[] result) {

		for (int i=1;i<=times2;i++) {
			System.out.println(times1 + " * " + i + " = " + result[i-1]) ;
		}
	}

}
