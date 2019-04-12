import java.util.Scanner;

public class Gugudan_Task1_Main {

	public static void main (String[] args) {
		
		System.out.println("작업할 구구단 단수 입력 : ") ;
		Scanner scanner = new Scanner(System.in) ;
		int times = scanner.nextInt() ;
		int[] result ;

        for (int i=2;i<=times;i++) {
        	result = Gugudan_Task1.calculate(i,times) ;
        	Gugudan_Task1.print(i,times,result) ;
        }
		
	}
}
