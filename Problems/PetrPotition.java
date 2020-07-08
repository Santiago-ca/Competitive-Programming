import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetrPotition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer linea = new StringTokenizer(entrada.readLine());

		int n=Integer.parseInt(linea.nextToken()),a=Integer.parseInt(linea.nextToken()),b=Integer.parseInt(linea.nextToken());
		
		System.out.println(a+b==n?b:1+b);
	}
}
