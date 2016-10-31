package calcuration;
import java.util.Scanner;
public class Calculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("input Number m> ");
		int m=Integer.parseInt(scan.next());
		System.out.print("input Number n> ");
	   int n=Integer.parseInt(scan.next());
	   
	   Calcuration_lib clib=new Calcuration_lib(m,n);
	   System.out.println("m+n="+clib.getPlus());
	   System.out.println("m-n="+clib.getMainasu());
	   System.out.println("m*n="+clib.getKakeru());
	   System.out.println("m/n="+clib.getWaru());
	   System.out.println("m%n="+clib.getAmari());

	}

}
