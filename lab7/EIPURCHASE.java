
import java.util.*;

public class EIPURCHASE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int t = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		double remain = v - n;
		double r = 0;
		for(r =0.0000000; r<0.1; r+=0.0000001) {
			double debt = remain * Math.pow(1 + r, t) - m * ((Math.pow((1 + r), t)-1) / r);
			if(debt >=0) break;
		}
		System.out.printf("%6f",r);
	}
}
