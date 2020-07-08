import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class UnckleJack {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int n,d;
		BigInteger res= new BigInteger("1");
		StringTokenizer linea;
		while(true){
			linea = new StringTokenizer(entrada.readLine());
			n=Integer.parseInt(linea.nextToken());d=Integer.parseInt(linea.nextToken());
			if(n==0 && d==0) break;
			res= new BigInteger(String.valueOf(n));
			System.out.println(res.pow(d));
		}
	}

}
