import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheatreSquare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer linea = new StringTokenizer(entrada.readLine());
		
		double n=Double.parseDouble(linea.nextToken()),m=Double.parseDouble(linea.nextToken()),a=Double.parseDouble(linea.nextToken());
		
		System.out.println(calc(n, m, a));
		
	}

	public static long calc(double n, double m, double a) {
		double u,d;
		u= Math.ceil(n/a); d=Math.ceil(m/a);	
		return  (long) (u*d);
		
	}
}
